import java.io.*;
class arraymaxmin
{
  public static void main(int n)throws IOException
    { 
        int i;int max;int min;
        int a[]=new int [n];
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); 
        for (i=0;i<n;i++)
         { 
             System.out.println("given element");

             
             
             
            }
            
           max=min=a[0];
           for(i=0;i<n;i++)
            { if(a[i]>max)
                max=a[i];
              else if(a[i]<min)
                    min=a[i];
                }
                System.out.println(max);
                System.out.println(min);
            }
        }      