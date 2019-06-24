package com.ioc.system;

import org.springframework.stereotype.Component;

@Component("vsale")
public class VanSale implements Sale{

	@Override
	public void registration() {
		// TODO Auto-generated method stub
		System.out.println("Van is being registered");
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment for van is processed");
	}

}
