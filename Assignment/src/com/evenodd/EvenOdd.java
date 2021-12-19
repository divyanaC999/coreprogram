package com.evenodd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of your choice :");
			int N = sc.nextInt();
			sc.close();
			
			if(N % 2 == 0) {
				System.out.println("Number if even.");
			}else {
				System.out.println("Number is odd.");
			}
	}

}