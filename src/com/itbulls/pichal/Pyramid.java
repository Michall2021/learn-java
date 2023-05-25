package com.itbulls.pichal;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of the pyramid: ");
		int userInput = sc.nextInt();

		for (int i = 1; i < userInput+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for(int i=userInput-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
		}
		System.out.println();
	}
	}
}