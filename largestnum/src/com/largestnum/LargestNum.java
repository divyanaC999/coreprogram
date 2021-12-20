package com.largestnum;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of x :");
	       int x = sc.nextInt();
	      System.out.println("Enter the value of y :");
	       int y = sc.nextInt();
	      System.out.println("Enter the value of z :");
	       int z = sc.nextInt();
	       sc.close();
	       if (x > y && x > z) {
	 	      System.out.println("The largest number is :" +x);   
	       }else if(y > x && y > z) {
	          System.out.println("The largest number is :" +y);  
	       }else {
		          System.out.println("The largest number is :" +z);  
	       }
	}

}