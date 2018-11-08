package special;

import java.util.Scanner;
class keith
{
    static int[] a;
    static Scanner sc = new Scanner(System.in);
    static boolean checkKeith(int n)
    {
        int p = n;
        int l = Integer.toString(n).length();
        a = new int[l];
        for(int i = l-1; i >= 0; i--)
        {
            a[i] = p % 10;
            p /= 10;
        }
        int sum = 0;
        while(a[l-1] <= n)
        {
            for(int i = 0; i < l; i++)
                sum += a[i];
            if(sum == n) 
                return true;
            for(int i = 0; i < l-1; i++)
                a[i] = a[i+1];
            a[l-1] = sum;
            sum=0;
        }
        return false;
    }
    public static void main()
    {
        int x = 0, y = 0;
        System.out.print("Enter lower limit: ");
        x = sc.nextInt();
        System.out.print("Enter upper limit: ");
        y = sc.nextInt();
        System.out.println("Keith numbers in the range:");
        for(int i = x; i <= y; i++)
            if(checkKeith(i) == true) 
                System.out.println(i);
    }
}
