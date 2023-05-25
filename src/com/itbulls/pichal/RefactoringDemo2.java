package com.itbulls.pichal;

public class RefactoringDemo2 {
public static void main(String[]args) {
	int i=10;

	
	printToConsole();

}

public static void printToConsole() {
	System.out.println("Some code that are not aligned");

	int sum = 10 + 5;
	System.out.println(sum);
	System.out.println(sum);
}
}
