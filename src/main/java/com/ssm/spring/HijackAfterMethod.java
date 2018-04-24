package com.ssm.spring;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * 之后通知
 * @author Administrator
 *
 */
public class HijackAfterMethod implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
		Object[] args, Object target) throws Throwable {
	        System.out.println("HijackAfterMethod : After method hijacked!");
	}
}