package com.itbulls.pichal;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {

		Scanner scener = new Scanner(System.in);

		
		System.out.print("Enter word: " );
		String word = scener.next();
		System.out.println("You entered this word; " + word);
		System.out.print("Enter any integer number: ");
		int i = scener.nextInt();
		System.out.println("You entered this integer number " + i);
		System.out.println("End of program");
	}

}
