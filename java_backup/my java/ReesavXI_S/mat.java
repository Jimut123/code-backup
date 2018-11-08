import java.util.*;
class mat
{
    int n[][];
    int s;
    mat(int p)
    {
        s=p;
        n=new int[s][s];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.println("Enter number");
                n[i][j]=sc.nextInt();
            }
        }
    }
    void clac()
    {
        System.out.println("Original matrix");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
             System.out.print(n[i][j]+" ");
             System.out.println();
            }
        System.out.println("New Matrix");
        int i=0,j=0,f=0,k=0,z=1;
        z=s*s;
        int q[]=new int[z+1];
        for(i=0,j=0;j<s;j++)
        {
        System.out.print(n[i][j]+" ");
        q[k++]=n[i][j];
    }
        System.out.println();
        for(i=0,j=0;i<s;i++)
        {
        System.out.print(n[i][j]+" ");
        q[k++]=n[i][j];
    }
        System.out.println();
        for(i=0;i<s;i++)
        {
        System.out.print(n[i][i]+" ");
        q[k++]=n[i][i];
    }
        System.out.println();
        for(i=s-1,j=s-1;j>=0;j--)
        {
        System.out.print(n[i][j]+" ");
        q[k++]=n[i][j];
    }
        System.out.println();
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                for(k=0;k<s;k++)
                {
                    if(n[i][j]==q[k])
                    f=1;
                }
                if(f!=1)
                {
                    System.out.println(n[i][j]+" ");
                    f=0;
                }
            }
        }
    }
}
    
