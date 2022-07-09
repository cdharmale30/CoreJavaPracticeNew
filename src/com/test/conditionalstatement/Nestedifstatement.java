package com.test.conditionalstatement;

public class Nestedifstatement {
public static void main(String[] args) {
	   String s= "chetan";
	   
	   if (s=="1") {
		   System.out.println("This statement fails");
		   {
		   if (s=="chetan") {
			   System.out.println("This statement Pass");
		   
	   }
	 }
   } 
}}

