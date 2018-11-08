class Increment_Decrement3
{
    public static void main()
    {
        int c=9,d=6,e=5;
        c=(++c * --d)% e+ e++/--d * --c;
        System.out.println(c);
    }
}

