package com.ioc.system2;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class ABCBank implements Bank,InitializingBean{

@Autowired
Account aaccount;

@PostConstruct
public void init(){

	System.out.println("#####################################");
	System.out.println("Bank created");
	System.out.println(aaccount);
	System.out.println(services);
	System.out.println("#####################################");
}

@PreDestroy
 public void destroy(){
	System.out.println("before Context getting ended");
}
@Autowired
Set<Services> services;
	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("ABC bank is established");
		for(Services s:services)
			s.addService("ABC Bank");
		aaccount.create();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("####### Bank created properties set ##########");
		
	}

}
