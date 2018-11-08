// Project folder:  ...\Source_IX\Chapter 15\FtoC
    import java.io.*;
    public class FtoC
    {
        public static void main(String[] args) throws IOException 
        {
                BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
                /* Declare the variables. */
                int F;
                double C = 0;
                System.out.println("Enter Fahrenheit temperature -> ");
                F = Integer.parseInt(stdin.readLine());
                C = 5.0/9.0 * (F-32);
                System.out.println("Degree celcius : " + C);
        }
    }