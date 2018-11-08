import java.util.*;
class arm
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no. ");
        int n=sc.nextInt();
        int d,s=0,num=n;
        while(n>0)
        {
            d=n%10;
            s=s+d*d*d;
            n=n/10;
        }
        if(num==s)
           System.out.println(" It is a armstrong number ");
        else
           System.out.println(" It is not a armstrong number ");
    }
}
        