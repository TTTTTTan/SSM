package com.tkl.spring;

import org.springframework.aop.ThrowsAdvice;

/**
 * 抛出异常后通知
 * @author Administrator
 *
 */
public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("HijackThrowException : Throw exception hijacked!");
	}
}