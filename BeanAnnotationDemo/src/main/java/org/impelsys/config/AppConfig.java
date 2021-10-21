package org.impelsys.config;

import org.impelsys.model.Processor;
import org.impelsys.model.impl.QuadCoreProcessor;
import org.impelsys.model.impl.SamsungMobile;
import org.springframework.context.annotation.Bean;
/*import org.impelsys.model.Processor;
import org.impelsys.model.impl.QuadCoreProcessor;
import org.impelsys.model.impl.SamsungMobile;
import org.springframework.context.annotation.Bean;*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ComponentScan("org.impelsys.model.impl")
public class AppConfig {
	//factory methods
	
	//@Lazy
	@Bean
	public SamsungMobile createSamsungPhone() {
		return new SamsungMobile();
	}
	
	//@Lazy
	@Bean
	public Processor createQuadCoreProcessor() {
		return new QuadCoreProcessor();
	}

	//@Lazy
	@Bean
	public Processor createOctaCoreProcessor() {
		return new QuadCoreProcessor();
	}

}
