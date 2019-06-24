package com.ioc.system2;

import org.springframework.stereotype.Component;

@Component("xaccount")
public class XYZAccount implements Account {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("XYZ account is being created");
	}

}
