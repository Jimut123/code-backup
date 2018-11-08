
public class sum
{
public static void main(int n)
{
    int a=0,b=1,c=2;
    System.out.println(a+","+b+","+c);
    for(int i=1;i<=(n-3);i++)
    {
        int d=(a+b+c);
        System.out.println(d);
        a=b;b=c;
        c=d;
    }
}
}
