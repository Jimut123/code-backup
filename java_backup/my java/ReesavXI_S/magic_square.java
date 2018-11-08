import java.util.*;
class magic_square
{
    int s;
    int a[][];
    magic_square(int n)
    {
        s=n;
        a=new int[s][s];
    }
    void magic()
    {
        int i=0,j=0;
        for(i=0;i<s;i++)
        for(j=0;j<s;j++)
        a[i][j]=0;
        int mid=s/2;
        int k=1,h=1;
        a[0][mid]=1;
        for(i=0;i<(s*s);i++)
        {
            a[h][mid+1]=++k;
                if(h<=s-2)
                h++;
                else
                h=0;
                if(mid<=s-2)
                {
                if(a[h][mid+1]==0)
                mid=mid+1;
            }
                else if(mid==s-2)
                mid=0;
                 
            }
        }
    
    void print()
    {
        for (int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
                