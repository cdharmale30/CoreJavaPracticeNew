package com.test.practice;

public class NarrowingTypeCasting {
public static void main(String[] args) {
	double d= 33.77;
	long l=(long)d;
	float f= (float)d;
	int  i = (int)l;
	System.out.println(d);
	System.out.println(f);

	System.out.println(l);

	System.out.println(i);
   }
}
