package com.Di;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class college {

	public static void main(String[] args) 
	    {try {
		ApplicationContext ac =new ClassPathXmlApplicationContext("Bean.xml");
		student st1 =ac.getBean("stu",student.class);
		
		
		Student2 st =ac.getBean("con",Student2.class);
		st1.details();
		st.details();
		
	
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
		}

}
