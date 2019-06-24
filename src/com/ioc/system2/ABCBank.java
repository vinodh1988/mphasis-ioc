package com.ioc.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class ABCBank implements Bank{

@Autowired
Account aaccount;
	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("ABC bank is established");
		aaccount.create();
	}

}
