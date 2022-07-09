package com.test.conditionalstatement;

public class returnStatement {
	public double compareNumber() {
	int x=10;
	int y=11;
     if (x>y) {
    	 
    	 return x;
     }else 
    	 return y;
	
}
	public static void main(String[] args) {
			returnStatement rs = new returnStatement();
			int n =(int)rs.compareNumber();
			System.out.println(n);
	}
}
