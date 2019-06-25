package com.ioc.system2;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZBank implements Bank{
	@Autowired
	Account xaccount;
	
	@Autowired
	Set<Services> services;
		@Override
		public void establish() {
			// TODO Auto-generated method stub
			System.out.println("XYZ bank is established");
			for(Services s:services)
				s.addService("XYZ Bank");
			xaccount.create();
		}

}
