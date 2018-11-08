// Project folder:  ...\Source_IX\Chapter 15\TotPer
        import java.io.*;
        public class MaxN
        {
                public static void main(String[] args) throws Exception
            {
                        BufferedReader Din =
                    new BufferedReader(new InputStreamReader(System.in));
                int num1, num2, num3; // Variables to hold three input values.
                    int max; // Variable to hold maximum value.
                    System.out.print("Enter first number : ");
                    num1 = Integer.parseInt(Din.readLine());
                    System.out.print("Enter second number : ");
                    num2 = Integer.parseInt(Din.readLine());
                    System.out.print("Enter third number : ");
                    num3 = Integer.parseInt(Din.readLine());
                    max = ((num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3));
                    System.out.print("Maximum is : " + max);
                }
		}