package com.ioc.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CoreBanking implements Services{

	@Override
	public void addService(String bank) {
		// TODO Auto-generated method stub
		System.out.println("Implementing Core banking for "+bank);
	}

}
