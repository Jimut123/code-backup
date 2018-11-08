import java.util.*;
public class Crazy_Matrx
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side i.e. >5");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            a[i][i]=1;
            a[i][n-i-1]=1;
        }
        int m=n-1;
        int l=1;
        for(int x=0;x<n/2;x++)
        {
            for(int ki=l;ki<m;ki++)
            {
                if(a[x][ki]!=1)
                {
                    a[x][ki]=2;
                }
                if(a[ki][x]!=1)
                {
                    a[ki][x]=3;
                }
            }
            m--;
            l++;
        }
        
        int op=1;
        int xyz=n-1;
        for(int to=n-1;to>n/2;to--)
        {
            for(int ti
           =op;ti<=xyz;ti++)
           {
               if(a[to][ti]!=1)
               {
                   a[to][ti]=5;
                }
                if(a[ti][to]!=1)
                {
                    a[ti][to]=4;
                }
            }
            xyz--;
            op++;
        }
        
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                System.out.print(" "+a[j][k]);
            }
            System.out.println();
        }
    }
}
                   