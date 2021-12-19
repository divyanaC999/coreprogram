package com.harmonicnum;

import java.util.*;

public class HarmonicNum {

	public static void main(String[] args) {
		    System.out.println("Enter the value of N:");
		   Scanner sc = new Scanner(System.in);
		   double N = sc.nextDouble();
		    double HarmonNum = 0;
		   for(double i = 1; i <= N; i++) {
			    HarmonNum = HarmonNum+(1/i);
		   }
		    System.out.println("Nth Harmonic value is " +HarmonNum);
		    sc.close();
	}

}
