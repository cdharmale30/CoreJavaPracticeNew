package com.test.practice;

public class ReturnUse2 {
 public int testmethod(int x,int y) {
	  if(x>y) {
		  return x;
	  }
		  else
			  return y;
	  }
 
 public static void main(String[] args) {
	 ReturnUse2 ru=new ReturnUse2();
	 int  check=ru.testmethod(323, 2);
	 System.out.println("thwjdejwhej"+check);
}
}
