package com.ioc.lifecycle;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class MyEvent  extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
	    return "My Event has occured"+ this.source;
	}

}
