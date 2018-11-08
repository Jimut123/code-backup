package Apc;  
import java.io.*;
class Apc_59_4
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int m[]={5,7,9,11,15,20,30,45,89,97};
        System.out.println("Enter a number to check whether it is present or not::");
        int ns = Integer.parseInt(cd.readLine());
        int ub=9,lb=0,p,k=0,pos=0;
        while(lb<=ub)
        {
            p=(ub+lb)/2;
            if(m[p]<ns)
            {
                lb=p+1;
            }
            if(m[p]>ns)
            {
                ub=p-1;
            }
            if(m[p]==ns)
            {
                k=1;
                pos = p;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("FOUND "+pos);
        }
        else
        {
            System.out.println("SEARCHED ELEMENT NOT FOUND");
        }
    }
}
