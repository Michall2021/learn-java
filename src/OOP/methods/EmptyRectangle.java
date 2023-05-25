/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * @author michal
 *
 */
public class EmptyRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int i=0;i<width;i++) {
			for (int j=0;j<height;j++) {
				if(j==0 || j==height-1 || i==0 || i==width-1) {
				    System.out.print("*");
				} else {
				    System.out.print(" ");
				}
		}
		System.out.println();
		}
		
		//for (int j=0;j<height;j++) {
			//System.out.print("*");
			
		}
		//System.out.println();
	}	
	//}


