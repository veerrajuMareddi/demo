package com.Di;

public class Student2 {
	
private	int id;
private	String name;
private	String group;

	
public Student2(int id, String name, String group) {
	this.id = id;
	this.name = name;
	this.group = group;
}


public void details()
{
	System.out.println(id+" "+name+" "+group+"  :  "+"this is from constructer injection");
}
}
