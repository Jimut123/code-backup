class baby
{
    public static void main(int a,int b,int c)
    {
        int total=(a+b+c);
        int avg=(a*b*c/3);
        System.out.println("total");
        System.out.println("avg");
        if(avg<40)
        System.out.println("p");
        else
        if(avg<60)
        System.out.println("g");
        else
        if(avg<75)
        System.out.println("s");
        else
        if(avg>=90)
        System.out.println("r");
    }
}