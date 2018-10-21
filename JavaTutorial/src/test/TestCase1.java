package test;

import java.lang.Character.Subset;

import library.Arithmetic;
import library.Conditional;

import java.io.*;

public class TestCase1 {
	
	//Variable Declaration & Initialization
	double a,b=2.5;
	static double c;
	
	//Instantiation
	static 
	Arithmetic arth = new Arithmetic();
	static Conditional con= new Conditional();
	
	//Main function
	public static void main(String[] args) {
		
		System.out.println("Welcome to Java session!");
		
		//Calling the reusable functions in non-static ways (by instance)
		 arth.addNumbers(10, 5);
		 arth.subtractNumbers(8, 3);
		 arth.multiplyNumbers(2, 4);
		 arth.divideNumbers(6, 4);
		 
		 
		 
		 arth.addNumbers(15.5, 5.7);
		 
		 //Static calling (by class name)
		 Arithmetic.moduloOfNumbers(6, 4);
		
		Conditional.maxMinOfNumber(128898, 128888);
		Conditional.maxMinNumbers(134.343, 454.454);
		Conditional.maxMinOfNumber(1, 1);
		
		con.weekDays(9);
		
		con.displayNumbers(1000);
	}

}
