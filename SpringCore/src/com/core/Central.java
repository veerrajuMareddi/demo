package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Central {

	public static void main(String[] args) 
	{
		ApplicationContext an=new ClassPathXmlApplicationContext("Bean.xml");
		CentralG c=an.getBean("central",Telangana.class);
		c.powerBill();
		c.ration();
		c.cal();
	}

}
