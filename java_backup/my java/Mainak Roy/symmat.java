import java.util.*;
public class symmat
{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side");
        int s=sc.nextInt();
        int a[][]=new int[s][s];int c=0;int d=1;
        rec1(a,s,c,d);
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
    void rec1(int a[][],int s,int c,int d)
    {
        for(int i=c;i<s;i++)
        {
            a[i][c]=d;
            a[c][i]=d;
            d++;
        }
        if(c==(s-1))
        {
            return;
        }
        	
        rec1(a,s,++c,d);
    }
}
    