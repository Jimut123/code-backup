class B extends A //class B inherits class A using inherit keyword.
{
    void dooverride(int k)
    {
        i=2*k;
        System.out.println("The value of i is : "+i);
    }
    public static void main(String args[])
    {
        B b = new B();
        b.dooverride(12);
    }
}