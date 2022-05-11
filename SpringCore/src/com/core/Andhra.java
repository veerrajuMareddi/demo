package com.core;

import java.util.Scanner;

public class Andhra implements CentralG 
{

	
	public void ration() {
		System.out.println("from andhra");
		//cal();
	}

	
	public void powerBill() {
		System.out.println("power");
		
	}
	public void cal()
	{
		int rice=50;
		int oil=150;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter how many kgs of rice you want");
		int r=sc.nextInt();
		System.out.println("enter how many liters of OIL you want");
		int s=sc.nextInt();
		System.out.println((rice*r) +(oil*s));
	}

}
