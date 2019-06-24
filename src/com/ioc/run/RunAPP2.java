package com.ioc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.system2.Bank;
import com.ioc.system2.JavaConfig;

public class RunAPP2 {
     public static void main(String n[]){
    	ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Bank b=(Bank)ac.getBean("abc");
    	b.establish();
    	System.out.println(b.hashCode());
    	b=(Bank)ac.getBean("abc");
    	b.establish();
    	System.out.println(b.hashCode());
    	
    	 b=(Bank)ac.getBean("xyz");
    	b.establish();

     }
}
