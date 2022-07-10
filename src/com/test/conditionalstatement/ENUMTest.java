package com.test.conditionalstatement;

public class ENUMTest {
enum testEnum {
	    LOW,
	    MEDIUM,
	    HIGH
	
}
public static void main(String[] args) {
	for (testEnum myVar : testEnum.values()) {
	System.out.println(myVar);
  }}
}
