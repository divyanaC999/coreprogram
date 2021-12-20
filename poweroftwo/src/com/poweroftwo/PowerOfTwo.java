package com.poweroftwo;

import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		System.out.println("Enter the power of 2");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N < 0 || N > 32) {
			System.out.println("Please enter in between 1 to 31");
		}else {
		for(int i = 0 ; i <= N ; i++) {
			System.out.println(Math.pow(2, i));
	}
	
		sc.close();
	}

	}

}
