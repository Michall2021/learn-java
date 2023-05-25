package com.itbulls.pichal;

public class Labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1: for (int i = 0; i < 5; i++) {
			System.out.println("counter i: " + i);
		loop2: for (int j = 0; j < 5; j++) {
				System.out.println("counter j: " + j);
					if (j >= 0 && j < 3) {
						System.out.println("continue loop2");
						continue loop2;
					} else {
						System.out.println("break loop1");
						break loop1;
					}
				}
	}
	}

}
