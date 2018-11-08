/*
Input 'n' (1-20). Calculate and print s = (1) + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + .. + n).
Use a method int sum(int n) to calculate sum.
*/

import java.io.*;

class Ex_3
{
    public static void main(String args[])throws IOException
    {
        int s, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter n (1-20) = ");
        n = Integer.parseInt(br.readLine());
        
        Sum S = new Sum();
        s = S.sum(n);
        
        System.out.print("\nSum = " + s);
    }
}

class Sum
{
    public int sum(int n)
    {
        int s1, s2, c;
        s1 = s2 = 0;
        for(c = 1; c <= n; c++)
        {
            s1 += c;
            s2 += s1;
        }
        return s2;
    }
}
