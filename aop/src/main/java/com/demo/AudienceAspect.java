package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //advice+pointcut
public class AudienceAspect {
	
	/*
	 * @AfterReturning("execution(public void doMagic())") public void clapping() {
	 * System.out.println("clapping...."); }
	 * 
	 * @AfterThrowing("execution(public void doMagic())") public void
	 * callTheDoctor() { System.out.println("callTheDoctor...."); }
	 */
	@Around("execution(public void doMagic())")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("before ...");
		Object result=pjp.proceed();
		System.out.println("after ...");
		return result;
	}
	
}