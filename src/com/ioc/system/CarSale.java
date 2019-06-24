package com.ioc.system;

import org.springframework.stereotype.Component;

@Component("csale")
public class CarSale implements Sale {

	@Override
	public void registration() {
		// TODO Auto-generated method stub
		System.out.println("Car Registration being done..");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Car payment is processed");
		
	}

}
