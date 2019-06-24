package com.ioc.system2;

import org.springframework.stereotype.Component;

@Component("aaccount")
public class ABCAccount implements Account{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Account created for ABC Bank");
	}

}
