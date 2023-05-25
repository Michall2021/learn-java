package com.itbulls.pichal;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class NewLineForDigit {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
String userInput=scanner.next();

System.out.println(userInput);
for(char digit: userInput.toCharArray()) {
System.out.println(digit);
	}
	}
}
