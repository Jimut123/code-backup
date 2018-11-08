// Project folder:  ...\Source_IX\Chapter 15\ACircle
    import java.io.*;
    public class ACircle
    {
        public static void main(String[] args) throws IOException 
        {
                BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
                /* Declare the variables. */
                double area = 0;
                int radius;
                System.out.println("Enter the radius of circle -> ");
                radius = Integer.parseInt(stdin.readLine());
                area = 3.14 * radius * radius;
                System.out.println("Area of cicle is : " + area);
        }
    }