package com.swapnum;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for val1 :");
		int val1 = sc.nextInt();
		System.out.println("Enter the value for val2 :");
		int val2 = sc.nextInt();
		sc.close();
			int temp;
			temp = val1;
			val1 = val2;
			val2 = temp;
		System.out.println("After swapping value of val1 :" +val1);
		System.out.println("After swapping value of val2 :" +val2);

	}

}