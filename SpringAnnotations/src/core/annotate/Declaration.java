package core.annotate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Declaration implements Sourcer 
{
	@Autowired
	private Custum var;
	private String name;
	   private int income;
	   public void direct()
	   {
		   System.out.println("from annotations");
		   var.method();
	   }
	
	public void impli() 
	{
		
	}
}
