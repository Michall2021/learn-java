package methods;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");

		String input = sc.nextLine();
		int[] intArray = convertStringArrayToIntArray(input.split("\\s+"));
		int maxInt = findMaxIntInArray(intArray);

		System.out.println("*** Initial Array *** :   ");

		System.out.println(Arrays.toString(intArray));

		System.out.println("*** Max number in array ***");

		System.out.println(maxInt);
	}

	public static int findMaxIntInArray(int[] intArray) {
		int max = intArray[0];
		for (int iterator : intArray) {
			if (iterator > max) {
				max = iterator;
			}

		}
		return max;
	}
	private static int[] convertStringArrayToIntArray(String[] stringArray) {
	int[] intArray = new int[stringArray.length];
	for (int iterator=0;iterator<stringArray.length;iterator++) {
		intArray[iterator] = Integer.valueOf(stringArray[iterator]);
	}
	return intArray;
	}
}