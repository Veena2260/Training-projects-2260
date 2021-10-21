package org.impelsys.BeanAnnotationDemo;

import org.impelsys.config.AppConfig;
import org.impelsys.model.impl.SamsungMobile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
    	applicationcontext.registerShutdownHook();
		//SamsungMobile s8 = applicationcontext.getBean(SamsungMobile.class);
    	//System.out.println("Lazy loading the Samsung Mobile");
    	SamsungMobile s8 = (SamsungMobile) applicationcontext.getBean("createSamsungPhone");
		s8.config();
    }
}
