package com.tkl.spring;


import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**
 * 环绕通知
 * 结合了之前通知，之后通知，抛出异常后通知
 * @author Administrator
 *
 */
public class HijackAroundMethod implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("环绕通知Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("环绕通知Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		System.out.println("环绕通知HijackAroundMethod : Before method hijacked!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("环绕通知HijackAroundMethod : Before after hijacked!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("环绕通知HijackAroundMethod : Throw exception hijacked!");
			throw e;
		}
	}
}