package com.itbulls.pichal;

import java.util.Iterator;

public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,2,3,4,5,6,7
	};
int sum=0;
for (int number : array) {
sum+=number;
System.out.println("number "+number);
System.out.println("sum "+sum);
}
System.out.println(sum);
System.out.println("jump statements");
System.out.println("continue");
for(int i =0;i<5;i++) {
	if (i%2==0) {
		continue;
	}
	System.out.println(i);
}
System.out.println("break");
for (int i = 0; i<5;i++) {
	if(i==3)break;
	System.out.println(i);
	
}
}

}
