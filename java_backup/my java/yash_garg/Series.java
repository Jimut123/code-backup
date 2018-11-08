import java.util.*;
class Series 
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no. ");
        int n=sc.nextInt();
        int a=0,b=1,c,i;
        System.out.print( a+" "+b );
        for(i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}