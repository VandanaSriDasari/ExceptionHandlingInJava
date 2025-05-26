package com.dvs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowsConcept {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C:/resume.pptx");
		FileInputStream fis=new FileInputStream(file);
		// compile time exceptions cant be handled by java 
		//so using throws keyword we say to Java to handle this checked exception
		//javac compiler identifies compile time exceptions while writing code
		// so it must be handled either with try-catch or throws
		
		//exception handling is all about handling checked exceptions
		//runtime exceptions generally occurs when we code illogical
		

		
		System.out.println("program ends");



	}

}
