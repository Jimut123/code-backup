public class factorial
{
    int a;
    factorial()
    {
        a=0;
    }
    public void input(int m)
    {
        a=m;
    }
    public void display()
    {
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial of "+a+" is ::"+f);
    }
}
            