/*
Wrtie a program in Java to input 'C' (0-100). Calculate 'F' from C/5 = (F-32)/9. 
Print C, F. If value of 'C' is <0 or >100 then the program should display error messege:
"Invalid data. Try again."
*/

import java.io.*;

class Ex_2
{
    public static void main(String args[])throws IOException
    {
        double c, f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(1 == 1)
        {
            System.out.print("\nEnter C (0-100) = ");
            c = Double.parseDouble(br.readLine());
            if(c<0 || c>100)
                System.out.println("***Invalid Input. Try again***");
            else
                break;
        }
        
        f = 9 * c / 5 + 32;
        System.out.println("\nC=" + c + "  F=" + f);
    }
}