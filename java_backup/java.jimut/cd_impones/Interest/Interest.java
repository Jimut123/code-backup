// Project folder:  ...\Source_IX\Chapter 15\Interest
    import java.io.*;
    public class Interest
    {
        public static void main(String[] args) throws IOException 
        {
                BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
                /* Declare the variables. */
                int Principal, Rate;
                double Interest = 0, Amount = 0;
                System.out.println("Enter principal amount -> ");
                Principal = Integer.parseInt(stdin.readLine());
                System.out.println("Enter rate of interest -> ");
                Rate = Integer.parseInt(stdin.readLine());
                System.out.println(Principal + "   " + Rate);
                Interest = Principal * Rate/100;   // Compute the interest.
                Amount = Principal + Interest;
                System.out.println("The interest earned is Rs. " + Interest);
                System.out.println("The value of the investment after one year is Rs. " + Amount);
        }
    }