// Project folder:  ...\Source_IX\Chapter 15\AOoperator
	import java.io.*;
	// Demonstrate arithmetic operators in Java
	public class AOperator
	{
		public static void main(String[] args) 
		{
			// Arithmetic operators using int data type
			System.out.println("Integer Arithmetic");
			System.out.println("------------------");
			int a = 10 + 4; // integer addition
			int b = a * 2;  // integer multiplication
			int c = b - a;  // integer subtraction
			int d = a / 2;  // integer division
			int e = -a;     // 
			int f = a % 2;  // Remainder division
			double g = b/4.0;   // Floating division
			System.out.println("Integer addition a = " + a);
			System.out.println("Integer multiplication b = " + b);
			System.out.println("Integer subtraction c = " + c);
			System.out.println("Integer division d = " + d);
			System.out.println("Integer assignment e = " + e);
			System.out.println("Remainder division f = " + f);
			System.out.println("Floating division g = " + g);
		}	
	}