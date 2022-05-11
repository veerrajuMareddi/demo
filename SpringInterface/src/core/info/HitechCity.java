package core.info;

import java.util.ArrayList;
import java.util.Scanner;

public class HitechCity implements Hr
{
	String x;
	public void hi() 
	{
		ArrayList <String> obj =new ArrayList <>();
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name to enter into Lb Nagar branch");
		x=sc.next();
		System.out.println("Emp : LM0342  "+" Name : "+obj.add(x) );
		
		
	}

	
	public void lb() {
		System.out.println();
		System.out.println("===========================================================");
		
          System.out.println(x +" ->  His/Him Moved  from Hitech city Branch to Lbnagar");
		
	}
}
