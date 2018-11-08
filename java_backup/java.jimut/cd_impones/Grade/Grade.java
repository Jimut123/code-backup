// Project folder:  ...\Source_IX\Chapter 15\Grade
import java.io.*;
// Demonstrate conditional operators in Java 
// to calculate the total and grade out of three subject marks
class Grade
{
 	public static void main(String[] args) 
	{
  		// Conditional operators using int data type
  		int mark1 = 70;
  		int mark2 = 50;
  		int mark3 = 80;
  		int total = mark1 + mark2 + mark3;
  		char grade = (total >= 200)? 'A' :'B';
  		System.out.println("The grade is " + grade);
 	}
}