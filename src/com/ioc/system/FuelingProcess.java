package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.lifecycle.MyEventPublisher;

public class FuelingProcess implements Process {
	
	@Autowired
	   MyEventPublisher mypub;

	@Override
	public void doProcess(String vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Fueling the "+vehicle);
		mypub.publish();
	}

}
