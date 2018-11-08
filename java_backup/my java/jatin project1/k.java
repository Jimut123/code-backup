 

import java.io.*;
class array_frequency 
{
    public  void input(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter limit");
         int n=Integer.parseInt(br.readLine());
         int a[]=new int[n];
         int b[]=new int[n];
         int c[]=new int[n];
         int t,i,j;
                 
          System.out.println("enter numbers in ist asrray");
          for(i=0;i<n;i++)
         a[i]=Integer.parseInt(br.readLine());
          System.out.println("enter numbers in 2nd asrray");
          for(i=0;i<n;i++)
       b[i]=Integer.parseInt(br.readLine());
       i=j=0;
       t=0;
       while(i<n && j<n)
       {
           if(p_check(a[i]==0)
           {
               c[t++]=a[i];
               i++;
            }
            else
            if(p_check(b[j]==0)
           {
               c[t++]=b[j];
               j++;
            }
            
            