// Project folder:  ...\Source_IX\Chapter 14\DataD
    import java.io.*;
    public class DataD
    {
        public static void main(String[] args) throws Exception
        {   
            BufferedReader Din = new BufferedReader(new InputStreamReader(System.in));
            int Number, nNum = 0;
            String strNumber;
            System.out.print("Enter a Number: ");
            strNumber = Din.readLine();
            Number = Integer.parseInt(strNumber);
            System.out.println("You entered a number : " + Number);
            nNum = Number + 10;
            System.out.println("Number after 10 increment : " + nNum);
            
        }
    }
