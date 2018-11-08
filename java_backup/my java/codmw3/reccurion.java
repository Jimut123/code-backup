import java.util.*;
public class reccurion
{
    int a;
    int b[][];
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,d,e,g;
        System.out.println("Enter limit");
        a=sc.nextInt();
        b=new int[a][a];
        for(d=0;d<a;d++)
        {
            for(c=0;c<a;c++)
            {
                System.out.println("Enter data");
                b[d][c]=sc.nextInt();
            }
        }
        e=1;
        g=0;
        bldia(e,g);
        e=1;
        g=0;
        abdia(e,g);
    }
void bldia(int h,int i)
{
    int k;
    for(k=0;k<i;k++)
    {
        System.out.print(+b[h][k]);
    }
    System.out.println();
    ++i;
    h=h+1;
    if(i>=a || h>=a)
    {
        return;
    }
    bldia(h,i);
}
void abdia(int h,int i)
{
    int k;
    for(k=h;k<a;k++)
{
    System.out.print(+b[i][k]);
}
   i=i+1;
   h=h-1;
   if(i>=a || h<0 )
   {
       return;
   }
    abdia(h,i);
}
}     