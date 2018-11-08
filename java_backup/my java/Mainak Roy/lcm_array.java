import java.util.*;
public class lcm_array
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter limit");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           System.out.println("enter element : ");
           a[i]=sc.nextInt();
        }
        int j=1;
        int op=0;
        int c=0;
       while(j>0)
       {
           for(int k=0;k<n;k++)
           {
               if(j%a[k]==0)
               {
                   c=c+1;
                }
            }
            if(c==n)
            {
                op=j;
                break;
                            }
            else
            {
                c=0;
            }
        }
        System.out.println("lcm ="+op);
            }
}
                
           