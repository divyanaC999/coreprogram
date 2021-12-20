package com.twodarray;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
	
	static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter number of rows :");
		sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		System.out.println("Rows : " + m + " columns : " + n);
		
		if (m > 0 && n > 0) {
			TwoDArray twoDArray = new TwoDArray();
			twoDArray.setArrayValues(m, n);
		} else {
			System.out.println("Invalid Input");
		}
	}
	//to check the value of array
	public void setArrayValues(int row, int col) {
		int[][] twoDArr = new int [row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value of [" + i + "][" + j + "] => ");
				twoDArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		TwoDArray twoDArray = new TwoDArray();
		twoDArray.printArrayValues(twoDArr, row, col);
	}
	//to print 2D Array
	public void printArrayValues(int[][] twoDArr, int row, int col) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				writer.write(""+twoDArr[i][j]+"\t");
				writer.flush();
			}
			writer.write("\n");
			writer.flush();
		}
		writer.close();
	}

}