public class Test4
{
    void Power2()
    {
        int n=1;
        double term=0;
        do
        {
            term=Math.pow(2,n);
            if(term>100)
            break;
            else
            System.out.println(term);
            n++;
        }
        while(n<=10);
    }
}