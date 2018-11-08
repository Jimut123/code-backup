import java.util.*;
public class rec_sym2
{
    int ar[][],a,i=0,j=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        a=sc.nextInt();
        ar=new int[a][a];
        int k=1;
        int n,m;
         gen(k);
         for(n=0;n<a;n++)
         {
             for(m=0;m<a;m++)
             {
                 System.out.print(+ar[m][n]);
                }
                System.out.println();
            }
        }
        void gen(int l)
        {
            ar[i][j]=ar[j][i]=l;
            j++;
            if(j==a)
            {
                i++;
                j=0;
            }
            if(i==a)
            {
                return;
            }
            gen(++l);
        }
        }
        