package custum.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {

	public static void main(String[] args) {
		try {
		ApplicationContext ac =new ClassPathXmlApplicationContext("Bean.xml");
		insurance sv =(insurance) ac.getBean("bean");
		sv.calc();
		
		//Wbean2 sv2 =ac.getBean("bean2",Wbean2.class);		
	//	sv2.method();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
