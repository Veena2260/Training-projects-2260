package org.impelsys.model.impl;

import org.impelsys.model.Processor;
import org.springframework.stereotype.Component;

@Component("octaCoreProcessor")
//@Primary
public class OctaCoreProcessor implements Processor{
	
	public OctaCoreProcessor(){
		System.out.println("constructing octacoreprocessor");
	}
	public void config() {
		System.out.println("i am octaprocessor");
		
	}

}
