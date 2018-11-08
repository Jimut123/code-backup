//pg-509
public class Test
{
    void Divisors(int num)
    {
        int i=2,count=2,lim=num/2;
        System.out.println("Other than the number itself and 1,the divisors of"+num+"are:");
        while(i<=lim)
        {
            if(num%i==0)
            {
                count++;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Total number of divisors:"+count);
    }
}