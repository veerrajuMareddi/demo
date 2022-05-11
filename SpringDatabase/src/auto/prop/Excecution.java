package auto.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Excecution 
 {

	public static void main(String[] args) throws Exception
	{
		try {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Config.class);
		Conn cn=ac.getBean(Conn.class);
		cn.values();
		cn.connection();
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
