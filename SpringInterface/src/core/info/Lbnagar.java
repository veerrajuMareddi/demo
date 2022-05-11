package core.info;

import java.util.ArrayList;
import java.util.Scanner;

public class Lbnagar implements Hr 
{

	String x;
	public void hi() 
	{
		ArrayList <String> obj =new ArrayList <>();
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter name to enter into Hitech city branch");
		x=sc.next();
		System.out.println("Emp : LM0367  "+" Name : "+ x);
		
		
	}

	
	public void lb() {
		System.out.println();
		System.out.println("===========================================================");
		
          System.out.println(x +" ->  His/Him Moved  from Lbnagar Branch to Hitech city");
		
	}

}
