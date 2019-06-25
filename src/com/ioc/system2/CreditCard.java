package com.ioc.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CreditCard implements Services{

	@Override
	public void addService(String bank) {
		// TODO Auto-generated method stub
		System.out.println("Credit card Services implemented for"+bank);
	}

}
