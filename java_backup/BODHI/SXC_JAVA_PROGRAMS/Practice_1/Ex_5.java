/*
Input n (1-20). Input 'n' arbitrary numbers and store them in an 1D array int a[].
Calculate and print the following :
(1) Sum of all the elements of a[i]
(2) Average of all the elements
(3) Largest Value
(4) Standard deviation.
*/

import java.io.*;

class Ex_5
{
    public static void main(String args[])throws IOException
    {
        int i, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter n (1-20) = ");
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("\nEnter the " + n + " numbers one by one : ");
        for(i = 0; i < n; i++)
        {
            System.out.print("a[" + i + "] = ");
            a[i] = Integer.parseInt(br.readLine());
        }
        
        Calculate C = new Calculate();
        int s = C.sum(a, n);
        int big = C.large(a, n);
        float avg = C.average(a, n);
        float sd = C.s_dev(a, n);
        
        System.out.println("The entered numbers : ");
        for(i = 0; i < n; i++)
            System.out.print(a[i] + "  ");
        System.out.println("\n\nSum=" + s + "  Largest=" + big + "  Average=" + avg + "  Standard_Deviation=" + sd);
    }
}

class Calculate
{
    int sum(int a[], int n)
    {
        int s, i;
        s = 0;
        for(i = 0; i < n; i++)
            s += a[i];
        return s;
    }
    int large(int a[], int n)
    {
        int big = a[0], i;
        for(i = 1; i < n; i++)
            if(a[i] > big)
                big = a[i];
        return big;
    }
    float average(int a[], int n)
    {
        int i, s;
        float avg;
        s = sum(a, n);
        avg = s / (float)n;
        return avg;
    }
    float s_dev(int a[], int n)
    {
        float sd, avg;
        int i;
        avg = average(a, n);
        sd = 0;
        for(i = 0; i < n; i++)
            sd += ((float)a[i] - avg) * ((float)a[i] - avg);
        sd = (float)Math.sqrt(sd / n);
        return sd;
    }
}