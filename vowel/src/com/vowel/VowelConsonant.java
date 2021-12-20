package com.vowel;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		      System.out.println("Enter an Alphabet :");
		      Scanner sc = new Scanner(System.in);
		      char ch = sc.next().charAt(0);
		      sc.close();
		      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
		         System.out.println("Given alphabet is a vowel");
		      }else{
		         System.out.println("Given alphabet is a consonant");
		      }
	}

}