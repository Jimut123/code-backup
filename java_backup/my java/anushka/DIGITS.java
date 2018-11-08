
abstract class DIGITS extends Number
{
    int n1;int s;
    void data()
    {
        n1=0;
    }
    void cal()
    {
        int a;
        while(n1>0)
        {
            a=n1%10;
            s=s+a;
            n1=n1/10;
        }
    }
    void show()
    {
        System.out.println("SUM OF DIGITS:"+s);
    }
}
