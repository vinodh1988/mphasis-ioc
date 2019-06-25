package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class Van implements Vehicle{

Manufacture manufacture;
@Autowired
Sale vsale;
	public Van(Manufacture manufacture) {
	super();
	this.manufacture = manufacture;
    }
	
	public void init(){
		System.out.println("Van instantiated");
		System.out.println(vsale);
	}


	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Van Class");
		manufacture.fit();
		manufacture.paint();
		vsale.registration();
		vsale.payment();
	}


	public Sale getVsale() {
		return vsale;
	}


	public void setVsale(Sale vsale) {
		this.vsale = vsale;
	}
 
}
