/*
Write a program to input 2 positive integers. Calculate and print:
(i) hcf (ii)lcm 
*/

import java.io.*;

class Ex_4
{
    public static void main(String args[])throws IOException
    {
        int a, b, h, lc;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter 'a' = ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter 'b' = ");
        b = Integer.parseInt(br.readLine());
        
        Hcf_Lcm HL = new Hcf_Lcm();
        h = HL.hcf(a, b);
        lc = HL.lcm(a, b);
        
        System.out.print("\na=" + a + "  b=" + b);
        System.out.print("\nHCF=" + h + "  LCM=" + lc);
    }
}

class Hcf_Lcm
{
    public int hcf(int a, int b)
    {
        int r;
        while((r = a % b) != 0)
        {
            a = b; b = r;
        }
        return b;
    }
    public int lcm(int a, int b)
    {
        int h, lc;
        h = hcf(a, b);
        lc = a * b / h;
        return lc;
    }
}