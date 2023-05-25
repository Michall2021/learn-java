package com.itbulls.pichal;

public class primitives {
	public static void main(String[] args) {
	byte b=1;
	short s =2;
	int i=3;
	
	long l=4;
	
	char c='a';
	boolean bool= true;
	float f= 1.2f;
	
	long l2=2_000_000_000;
	char c2=100;
	System.out.println(c2);
	System.out.println(c);
	System.out.println(l);
	
	long number = 499_999_999_000_000_001L;
	double converted = (double) number;
	System.out.println(number - (long) converted);
	
	
	}
}
