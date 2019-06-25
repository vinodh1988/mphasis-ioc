package com.ioc.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Demat implements Services {

	@Override
	public void addService(String bank) {
		// TODO Auto-generated method stub
		System.out.println("Demat Account Service implemented for "+bank);
	}

}
