package com.itbulls.pichal;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+"))); // POSIX character classes
	
	}

}
