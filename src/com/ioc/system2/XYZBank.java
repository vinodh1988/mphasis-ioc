package com.ioc.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZBank implements Bank{
	@Autowired
	Account xaccount;
		@Override
		public void establish() {
			// TODO Auto-generated method stub
			System.out.println("XYZ bank is established");
			xaccount.create();
		}

}
