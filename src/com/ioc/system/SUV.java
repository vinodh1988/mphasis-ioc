package com.ioc.system;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class SUV implements Vehicle,InitializingBean{

Manufacture manufacture;

@Autowired	
Sale csale;

List<Process> processess;


public List<Process> getProcessess() {
	return processess;
}

public void setProcessess(List<Process> processess) {
	this.processess = processess;
}

public Manufacture getManufacture() {
	return manufacture;
}

@PostConstruct
public void init_method(){
	System.out.println("#####################################");
	System.out.println("SUV initialized");
	System.out.println(manufacture);
	System.out.println(processess);
	System.out.println("#####################################");
}



public void destroyed(){
	System.out.println("SUV Destroyed");
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
		for(Process p:processess)
			p.doProcess("SUV");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("#####################################");
		System.out.println("SUV Properties set");
		System.out.println(manufacture);
		System.out.println(processess);
		System.out.println("#####################################");
	}
}


