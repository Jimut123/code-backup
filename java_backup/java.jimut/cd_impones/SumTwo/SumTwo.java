// Project folder:  ...\Source_IX\Chapter 17\SumTwo
	import java.io.*;
    public class SumTwo {
            // Called Method
            public void Sum_Num() throws IOException {
  		    	BufferedReader but = new BufferedReader (new InputStreamReader(System.in));
                int a, b, sum=0;
                System.out.print("Enter first number : ");
                a = Integer.parseInt(but.readLine());
                System.out.print("Enter second number : ");
                b = Integer.parseInt(but.readLine());
                sum = a + b;
                System.out.println("The sum is : " + sum);
            }
            public static void main(String args[]) throws IOException {
                SumTwo Sm = new SumTwo();   
                Sm.Sum_Num();   // Method is called here
            }
	}