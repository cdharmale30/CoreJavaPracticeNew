package com.test.practice;

public class LocalVariables {
	 public int instance1=11;
	 public static int  Teststatic=44;  //static Variable 
	public void testMethod() {
		 int  lc= 13;
		System.out.println("This is static variable"+lc);
	}
public static void main(String[] args) {
	LocalVariables lv=new LocalVariables();
	
	System.out.println(lv.instance1);
	System.out.println("This is static variable"+Teststatic); //called static variable using class name
	System.out.println(LocalVariables.Teststatic);  //called static variable using class name
	
	lv.testMethod();
}
}
