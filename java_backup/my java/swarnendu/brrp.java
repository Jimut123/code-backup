import java.util.*;
class brrp
{
    public void main()
    {
        int a;
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a no");
       a=sc.nextInt();
       if(a>0)
       System.out.println(a+"is apositive no");
       else
       if(a<0)
       System.out.println(a+"is a negative no");
       else
       System.out.println("the number is zero");
    }
}