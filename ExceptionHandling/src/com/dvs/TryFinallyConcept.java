package com.dvs;

import java.util.Scanner;

public class TryFinallyConcept {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("program starts");
		System.out.println("Enter a: ");
		int a=s.nextInt();
		System.out.println("Enter b: ");
		int b=s.nextInt();

		int result=0;
		

		try {
			// Code that might throw an exception
			result=a/b; //This might throw an ArithmeticException
			
		}
		finally {
			 // Code that will always be executed
			System.out.println("Finally Block executed");
			s.close();
		}

		System.out.println(result);
		System.out.println("program ends");



	}

}
