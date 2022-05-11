package com.core;

import java.util.Scanner;

public class Telangana implements CentralG 
{
  
	@Override
	public void ration() {
		System.out.println("");
		cal();
	}

	
	public void powerBill() {
		// TODO Auto-generated method stub
		
	}
	public void cal()
	{
		int rice=500;
		int oil=150;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter how many kgs of rice you want");
		int r=sc.nextInt();
		System.out.println("enter how many liters of OIL you want");
		int s=sc.nextInt();
		System.out.println((rice*r) +(oil*s));
	}

}
