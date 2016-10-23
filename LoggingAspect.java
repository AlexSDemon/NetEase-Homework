package com.netease.course;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.netease.course.Caculator.*(..)) && args(a, ..)")
	private void arithmeticDoLog(JoinPoint jp, int a) {
		System.out.println(a + ": " + jp.toString());
	}
	
}
