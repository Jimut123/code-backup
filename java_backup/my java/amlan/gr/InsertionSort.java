package gr;

//insertion sort
import java.io.*;
class InsertionSort
{
  int n;
  int a[]=new int[100];
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void input()throws IOException
  {
      int i;
      System.out.println("enter no. of terms");
       n=Integer.parseInt(br.readLine());
      for(i=0;i<n;i++)
      {
          System.out.println("enter element:");
           a[i]=Integer.parseInt(br.readLine());
        }
        isort();
        disp();
    }
    void isort()
    {
        int i,j,t;
        for(i=0;i<n;i++)
        {
            t=a[i];
            for(j=i-1;j>=0;j--)
            {
                if (t<a[j])
                {
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    void disp()
    {
        int i;
        for(i=0;i<n;i++)
         System.out.println(a[i]);
        }
    }
         