package com.ioc.lifecycle;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(* com.ioc.system2.Demat.addService(..))")
	public void point(){}
	
	@Before("point()")
	public void executeThis(){
		System.out.println("<<<<<<<< Aspect Oriented Programming working....>>>>>>>");
	}
	
	@After("point()")
	public void executeThisToo(){
		System.out.println("<<<<<<<< Aspect Oriented Programming working....>>>>>>>");
	}

}
