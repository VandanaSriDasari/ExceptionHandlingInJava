package com.dvs;

import java.util.Scanner;

public class ThrowConcept {

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
			System.out.println(ae.toString());//write logic that enters this msg into logs
			throw ae; 
			//-if we want to stop the program by Java write throw inside a catch block
			//write our operations required in Catch block and to stop the program
			//execution, throw the exception back to Java and Java stop the program.
			//-dont write anything after throw because it wont execute.
		}
		finally {
			s.close();
		}
		

		System.out.println(result);
		System.out.println("program ends");

	}

}
