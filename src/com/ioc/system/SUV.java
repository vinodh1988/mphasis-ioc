package com.ioc.system;

import org.springframework.beans.factory.annotation.Autowired;

public class SUV implements Vehicle{

Manufacture manufacture;

@Autowired	
Sale csale;


public Manufacture getManufacture() {
	return manufacture;
}

public void setManufacture(Manufacture manufacture) {
	this.manufacture = manufacture;
}




	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("SUV class");
		manufacture.fit();
		manufacture.paint();
		csale.registration();
		csale.payment();
	}

}
