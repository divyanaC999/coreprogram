package com.distance;

import java.util.Scanner;

public class Distance {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Print the value of point X");
		 int x = sc.nextInt();
		 System.out.println("Print the value of point Y");
		 int y = sc.nextInt();
		 
		 int val = (int) ((Math.pow(x, 2))+(Math.pow(y, 2)));
		 double distance = (int) Math.sqrt(val);
		 System.out.println("Euclidean Distance is :" +distance);

	}

}
