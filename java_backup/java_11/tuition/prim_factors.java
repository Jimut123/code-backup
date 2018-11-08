import java.io.*;
class prim_factors
{
     InputStreamReader ab = new InputStreamReader(System.in);
     BufferedReader cd = new BufferedReader(ab);
     int num[]=new int[200];
     int size,i,n;
     prim_factors()
     {
         for(i=0;i<200;i++)
         {
             num[i]=0;
         }
     }
     void readsize(int nx)
     {
         size = nx;
     }
     void get_numbers()throws IOException
     {
         for(i=0;i<size;i++)
         {
             System.out.println("Enter the number:");
             num[i]=Integer.parseInt(cd.readLine());
            }
     }
     void show_primeFact()
     {
         for(i=0;i<size;i++)
         {
             n=num[i];
             i=2;
             System.out.print("The prime factors are:");
             while(i<=n)
             {
                 if(n%i==0)
                 {
                     n=n/i;
                     System.out.println(i);
                     continue;
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }
}
