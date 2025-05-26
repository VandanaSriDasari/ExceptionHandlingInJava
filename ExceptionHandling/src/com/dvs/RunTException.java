package com.dvs;

import java.util.Scanner;

public class RunTException {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("program starts");
		System.out.println("Enter a: ");
		int a=s.nextInt();
		System.out.println("Enter b: ");
		int b=s.nextInt();

		int result=0;
		

		try {
			result=a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			//throw ae;
		}

		System.out.println(result);
		System.out.println("program ends");



	}

}
