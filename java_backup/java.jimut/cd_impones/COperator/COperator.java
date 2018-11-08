// Project folder:  ...\Source_IX\Chapter 15\COperator

import java.io.*;
// Demonstrate conditional operators ? in Java
class COperator
{
    public static void main(String[] args) throws IOException 
    {
		// Relational operators using int data type
		System.out.println("Conditional Operator");
		BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
		int age;
		System.out.println("Enter your age : ");
        		age = Integer.parseInt(stdin.readLine());
		// Using conditional ? operator
		boolean flag = age <= 15 ? true : false; 
		System.out.print("Your age is " + age);
		if (flag)
          			System.out.print(" and you are in secondary school.");
		else
			System.out.print("and you passed out the secondary school.");
    }
}