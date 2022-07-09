package com.test.conditionalstatement;

public class Strictfp {
public static void main(String[] args) {
	for (int i =1;i <=10;i++) {
        if(i==5){  
	continue;/// Using This not printing the i value  so Directly run remaining number expcet 5
	 }
        System.out.println(i);  

}}
}
