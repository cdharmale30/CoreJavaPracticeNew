package com.test.practice;

public class ATMMachineProgram {
public static void main(String[] args) {
	int currentBalance = 500;
	int availableBalance = 111;
	int typebalance;
	
	
	if (availableBalance>=currentBalance ){	
		
		typebalance =availableBalance-currentBalance;
	      System.out.println("able to remove Amount");
	}else if (availableBalance<0) {
	      System.out.println("Not able to remove balance is low");
	}
	
}}

