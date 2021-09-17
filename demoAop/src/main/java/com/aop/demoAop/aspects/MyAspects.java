package com.aop.demoAop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspects {

	@Before("execution(* com.app.demoAop.service.makePayment())")
	public void BeforePayement() {
		System.out.println(" payment started...");
	}
}
