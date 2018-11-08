package jatin_new_proj;
import java.io.*;
class array_frequency 
{
    public static void main(String args[])throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter limit");
         int n=Integer.parseInt(br.readLine());
         int a[]=new int[n];
         int i,j,f,f1,max,min;
         max=min=0;
        System.out.println("enter elements");
          for(i=0;i<n;i++)
             a[i]=Integer.parseInt(br.readLine());
          for(i=0;i<n;i++)
          if(a[i]>max)
          max=a[i];
          else
          if(a[i]<min)
          min=a[i];
          
          for(i=min;i<=max;i++)
          {
              f1=0;
              for(j=0;j<n;j++)
              {
                  if(i==a[j])
                  f1++;
                 
                }
              if(f1>0)  
                System.out.println("the frequncy of "+i+" is "+f1);
            }
        }
    }