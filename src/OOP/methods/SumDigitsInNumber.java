package methods;

import java.util.Scanner;

import com.itbulls.pichal.math;

public class SumDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(Integer number) {	
		int result = 0;
		while(number !=0) {
			result += number % 10;
			number /=10;
		}
		return Math.abs(result) ;
	}

}
