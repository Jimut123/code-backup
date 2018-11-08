import java.util.*;
class denom
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
    }
    void calc()
    {
        int a[]={1000,500,100,50,20,10,5,2,1,0};
        int j=0,r=0;
        while(n>0)
        {
            r=n/a[j];
            if(a[j]!=1)
            r=r-1;
            n=n-(a[j]*r);
            System.out.println("rs "+a[j]+" = "+r);
            j=j+1;
        }
    }
    void main()
    {
        denom dm=new denom();
        dm.input();
        dm.calc();
    }
}