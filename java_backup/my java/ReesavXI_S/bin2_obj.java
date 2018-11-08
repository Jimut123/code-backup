import java.util.*;
class bin2_obj
{
    int n;
    bin2_obj(int s)
    {
        n=s;
    }
    void main()
    {
        int s=0;int s1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        s=sc.nextInt();
        bin2_obj x=new bin2_obj(s);
        System.out.print("Enter a second number ");
        s1=sc.nextInt();
        bin2_obj y=new bin2_obj(s1);
        int z=0;
        z=Max(x.n,y.n);
        System.out.print("Max "+z);
    }
    int Max(int n,int s)
    {
        if(n>s)
        return n;
        return s;
    }
}