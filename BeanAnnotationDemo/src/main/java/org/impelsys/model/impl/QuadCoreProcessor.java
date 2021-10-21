package org.impelsys.model.impl;

import org.impelsys.model.Processor;
import org.springframework.stereotype.Component;

@Component
public class QuadCoreProcessor implements Processor{
	
	public QuadCoreProcessor(){
		System.out.println("constructing quadprocessor");
	}
	public void config() {
		System.out.println("this is a quadcoreProcessor");
	}

}
