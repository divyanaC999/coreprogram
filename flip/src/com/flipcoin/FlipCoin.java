package com.flipcoin;

import java.util.*;

public class FlipCoin {

		static int headCounter = 0;
		static int tailCounter = 0;

		public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times you want to flip the coin?");
		int cnt = sc.nextInt();
		    sc.close();
		if (cnt <= 0) {
			System.out.println("Invalid input");
		}else {
			FlipCoin fc = new FlipCoin();
		    fc.filpCoin(cnt);
			System.out.println("Head count : "+ FlipCoin.headCounter + "\nTail Count : " +FlipCoin.tailCounter);
			//System.out.println("Valid input");
			double headPercentage = (headCounter * 100) / cnt;
			double tailPercentage = (tailCounter * 100) / cnt;
			
			System.out.println("Head count percentage : "+ headPercentage + "\nTail Count : " + tailPercentage);
		}
		}
		public void filpCoin(int counter) {
			 headCounter = 0;
			 tailCounter = 0;
			for (int i =  0; i < counter; i++) {
			  double result = Math.random();
			
			 if(result < 0.5) {
			  tailCounter++;
			 }else {
				 headCounter++;
			 }
			 }// TODO Auto-generated method stub

	}

}
