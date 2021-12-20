package com.windchill;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tempreture :");
		double t = sc.nextInt();
		System.out.println("Enter Speed :");
		double v = sc.nextInt();
		
		if (t > 50 || v > 120 || v < 3 ) {
			 System.out.println("Please give valid input.");
		}else {
			int w = (int) (35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v , 0.16 )); 
			 System.out.println("The National Weather Service defines the effective tempreture (the wind chill) to be :" +w+" Degree ");
		}
	}

}