package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

import com.ioc.lifecycle.MyEventPublisher;

public class TestingProcess implements Process {
@Autowired
  MyEventPublisher mypub;

	@Override
	public void doProcess(String vehicle) {
		// TODO Auto-generated method stub
		System.out.println("Testing the "+vehicle);
		mypub.publish();
	}

}
