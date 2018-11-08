// Project folder:  ...\Source_IX\Chapter 16\GTwoIF
    import java.io.*;
    public class GTwoIF
    {
        public static void main(String[] args) throws IOException 
        {
                BufferedReader stdin = 
                new BufferedReader (new InputStreamReader(System.in));
                int num1, num2, Max;
                System.out.print("Enter a number for num1 : ");
                num1 = Integer.parseInt(stdin.readLine());
                System.out.print("Enter another number for num2 : ");
                num2 = Integer.parseInt(stdin.readLine());
                if (num1 == num2) {
                    System.out.print("Numbers are equal.");
                } 
                if (num1 > num2) {
                    System.out.print("First number greater than the second number.");
                }
                else if (num2 > num1) {
                    System.out.print("Second number greater than the first number.");
                }
        }
    }