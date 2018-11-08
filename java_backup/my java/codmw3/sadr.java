import java.util.*;
public class sadr
{
    Scanner sc=new Scanner(System.in);
    int ar[][],a;
    void input()
    {
        int m,n,fl=0;
        System.out.println("Enter limit");
        a=sc.nextInt();
        ar=new int[a][a];
        for(m=0;m<a;m++)
        {
            for(n=0;n<a;n++)
            {
                System.out.println("Enter number");
                ar[m][n]=sc.nextInt();
            }
        }
        display();
        System.out.println();
        for(m=0;m<a;m++)
        {
            for(n=0;n<a;n++)
            {
                fl=ch(m,n);
                if(fl==1)
                {
                    rear(m,n);
                    break;
                }
            }
        }
        display();
    }
    int ch(int m,int n)
    {
        int c1,c2,i,j;
        c1=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if(i==m && j==n)
                {
                    continue;
                }
                if(ar[m][n]>ar[i][j])
                {
                    c1++;
                }
            }
        }
        c2=0;
        for(i=0;i<a;i++)
        {
            for(j=0;j<a;j++)
            {
                if(ar[m][n]<ar[i][j])
                {
                    c2++;
                }
            }
        }
        if(c2>=a-1 && c1>=a-1)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
    void rear(int i,int j)
    {
        int b,m,n,k;
        for(b=0;b<a;b++)
        {
            if(b==j)
            {
                continue;
            }
            for(m=0;m<a;m++)
            {
                for(n=0;n<a;n++)
                {
                    if(m==i && n==j)
                    {
                        continue;
                    }
                    if(ar[i][b]<ar[m][n])
                    {
                        k=ar[m][n];
                        ar[m][n]=ar[i][b];
                        ar[i][b]=k;
                    }
                }
            }
        }
        for(b=0;b<a;b++)
        {
            if(b==i)
            {
                continue;
            }
            for(m=0;m<a;m++)
            {
                for(n=0;n<a;n++)
                {
                    if(m==i && n==j)
                    {
                        continue;
                    }
                    if(ar[b][j]>ar[m][n])
                    {
                        k=ar[m][n];
                        ar[m][n]=ar[b][j];
                        ar[b][j]=k;
                    }
                }
            }
        }
    }
    void display()
    {
        int m,n;
        for(m=0;m<a;m++)
        {
            for(n=0;n<a;n++)
            {
                System.out.print(+ar[m][n]+" ");
            }
            System.out.println();
        }
    }
}
                
    
    