import java.util.*;
public class rec_sym
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,n,k=1;
        System.out.println("Enter data");
        a=sc.nextInt();
         int ar[][]=new int [a][a];
         for(b=0;b<a;b++)
         {
             for(n=0;n<a;n++)
             {
                 ar[b][n]=ar[n][b]=k;
                 k++;
                }
            }
             for(b=0;b<a;b++)
         {
             for(n=0;n<a;n++)
             {
                System.out.print(+ar[b][n]);
                }
                System.out.println();
            }
        }
    }
             