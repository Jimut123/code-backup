//Book pg-507(14.36)
public class Digit
{
    int SumDigits(int num)
    {
        int num2=num;
        int dig,q,sum=0;
        while(num2>0)
        {
            q=num2/10;
            dig=num2%10;
            sum=sum+dig;
            num2=q;
        }
        return sum;
    }
    void checkIt()
    {
        int n1=345,n2=672,n3=13602;
        int s=0;
        s=SumDigits(n1);
        System.out.println("Sum od digits of"+n1+"is:"+s);
        s=SumDigits(n2);
        System.out.println("Sum of digits of"+n2+"is:"+s);
        s=SumDigits(n3);
        System.out.println("Sum of digits of"+n3+"is:"+s);
    }
}