class output 
{ 
    public static void main(String args[])
    {
        int a=10;int b=7;int c;
        c=++a + --b + a++ + b++ + a+b;
        System.out.println(c);
    }
}