class Increment_Decrement2
{
    public static void main()
    {
        int c=15;
        int d=9;
        c+=((++c + --d)/++c * --d/c++ * d--);
        System.out.println(c);
    }
}
