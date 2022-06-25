package com.test.practice;

public class LocalVariables {
	 public int instance1=11;
	 public static int  Teststatic=44;
	public void testMethod() {
		int  lc= 10;
		
	}
public static void main(String[] args) {
	LocalVariables lv=new LocalVariables();
	
	System.out.println(lv.instance1);
}
}
