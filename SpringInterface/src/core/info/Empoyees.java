package core.info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Empoyees {
	
	public static void main(String args[]) 
	{
		ApplicationContext ac =new ClassPathXmlApplicationContext("Bean.xml");
				Allocation es=ac.getBean("emp",Allocation.class);
				  es.every();
	}

}
