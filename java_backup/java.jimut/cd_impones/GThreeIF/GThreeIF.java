// Project folder:  ...\Source_IX\Chapter 16\GThreeIF
    import java.io.*;
    public class GThreeIF
    {
        public static void main(String[] args) throws IOException 
        {
                BufferedReader stdin = 
                new BufferedReader (new InputStreamReader(System.in));
                int num1, num2, num3, Max=0;
                System.out.print("Enter Number 1 : ");
                num1 = Integer.parseInt(stdin.readLine());
                System.out.print("Enter Number 2 : ");
                num2 = Integer.parseInt(stdin.readLine());
                System.out.print("Enter Number 3 : ");
                num3 = Integer.parseInt(stdin.readLine());
                if ((num1 >= 0) && (num2 >= 0) && (num3 >= 0))
                {
                    Max = num1;
                    if (num2>Max)
                        Max = num2;
                    if (num3>Max)
                        Max = num3;
                }
                else
                    System.out.print("Zero value not allowed");
                System.out.print("Greater number is : " + Max);                
        }
    }