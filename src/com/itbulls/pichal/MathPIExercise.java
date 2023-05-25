package com.itbulls.pichal;
import java.util.Formatter;
import java.util.Arrays;
import java.util.Scanner;

public class MathPIExercise {

	public static void main(String[] args) {
		Formatter formatterVariable=new Formatter();
		formatterVariable.format("%.1f", Math.PI);
		System.out.println(" 1 decimal digit "+ formatterVariable);
		
		formatterVariable = new Formatter();
		formatterVariable.format("%.2f", Math.PI);
		System.out.println(" 2 decimal digits "+ formatterVariable);
		
		formatterVariable = new Formatter();
		formatterVariable.format("%.3f", Math.PI);
		System.out.println(" 3 decimal digits "+ formatterVariable);
		
		formatterVariable = new Formatter();
		formatterVariable.format("%.4f", Math.PI);
		System.out.println(" 4 decimal digits "+ formatterVariable);
		
		formatterVariable = new Formatter();
		formatterVariable.format("%.5f", Math.PI);
		System.out.println(" 5 decimal digits "+ formatterVariable);
		
		formatterVariable = new Formatter();
		formatterVariable.format("%.6f", Math.PI);
		System.out.println(" 6 decimal digits "+ formatterVariable);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\.,?'']")));
		
		
		
		System.out.println(Math.PI);
		

	}

}
