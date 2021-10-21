package org.impelsys.model.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.impelsys.model.Mobile;
import org.impelsys.model.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component("samsungGalaxy")

public class SamsungMobile implements Mobile {
	
	@Autowired
	@Qualifier("octaCoreProcessor")
	Processor processor;
	
	public SamsungMobile(){
		System.out.println("In Constructor");
	}
	
	public void config() {
	System.out.println("Octa Core , 12MP camera, 8GB Ram");
	processor.config();

	}
	
	//init method
	@PostConstruct
	public void init(){
		System.out.println("Initializing the SamsungMobile ");
	}
	
	@PreDestroy
	public void destroy(){
		//shutdown activities
		System.out.println("Doing cleaning activities before SamsungMobile is destroyed");
	}

}