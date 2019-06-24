package com.ioc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.system.Vehicle;

public class RunAPP {
  public static void main(String[] args) {
	  
	  ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
	  
	 // Vehicle v=new Car();
	  
	  Vehicle v= (Vehicle)ac.getBean("car");
	  v.info();
	  v=(Vehicle)ac.getBean("van");
	  v.info();
	
  }
}
