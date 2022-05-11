package core.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Apex {

	public static void main(String[] args) 
	{
		try 
	{
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(Configurate.class);
		Declaration dc = ac.getBean(Declaration.class);
		dc.direct();
		
		dc.impli();
		ac.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
