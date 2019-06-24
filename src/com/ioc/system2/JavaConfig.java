package com.ioc.system2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.ioc.system2")
public class JavaConfig {

	@Bean(name="abc")
	@Scope(value="prototype")
	public Bank getBank1(){
		return new ABCBank();
	}
	
	@Bean(name="xyz")
	public Bank getBank2(){
		return new XYZBank();
	}
	
	
}
