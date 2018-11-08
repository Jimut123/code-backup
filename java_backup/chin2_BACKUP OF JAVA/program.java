public class program
{
    program(){}
    program(int a)
    {
        System.out.println(a);
        int x = 0;
        int b ;int sum=0;int count = 0;
        System.out.println("THE MAGIC NUMBERS ARE AS FOLLOWS ::");
        for(int i = a;i <= 10000; i++)
        {   b = i;
            while(b>=10)
            {
                while(b!=0){
                    sum=sum+(b%10);
                    b=b/10;
                }
                b=sum;
                sum = 0;
            }
            if(b == 1)
            {
                count++;
                if(count%30 == 0)
                System.out.println(i+"   ");
                else
                System.out.print(i+"   ");
            }
        }
        for(int e = 1 ; e <= 10; e++)
        {
            for(long i1 = 1;i1<=2000000000;i1++)
            {}
            for(long i1 = 1;i1<=2000000000;i1++)
            {}
        }
        System.out.println("\f");
        thankyou();
    }
}
