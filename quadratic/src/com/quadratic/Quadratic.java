package com.quadratic;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a :" );
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b :" );	
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c :" );
		int c = sc.nextInt();
		
           int delta = b * b - 4 * a * c ;
     		System.out.println(delta);
          int firstroot = (int) ((-b + Math.sqrt(delta))/(2 * a));
  		System.out.println("Value of Root 1 of x :" +firstroot );
          int secondroot = (int) ((-b - Math.sqrt(delta))/(2 * a));
  		System.out.println("Value of Root 1 of x :" +secondroot );


	}
}