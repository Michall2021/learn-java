package com.itbulls.pichal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDoubles {
	public static void main(String[] args) {
		int i =20;
		System.out.println(i/3);
		System.out.println(i-(6*3));
		System.out.println((double) i/3);
		
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		System.out.println(rideFee);
		BigDecimal amountOfPeople=BigDecimal.valueOf(3);
		BigDecimal chargePerPersonBigDecimal = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
	System.out.println(chargePerPersonBigDecimal);
	
	double d=3.1;
	double d2=1.21;
	System.out.println(d-d2);
	
	BigDecimal bd =BigDecimal.valueOf(d).setScale(2);
			BigDecimal bd2 =BigDecimal.valueOf(d2).setScale(2);
			System.out.println(bd.subtract(bd2));
	}

}
