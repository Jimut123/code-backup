public class MyFirstClass
{
    public static void  main(String args[])
    {
        System.out.println("\f");
        Fraction x=new Fraction(3,4);
        Fraction y=new Fraction(1,4);
        Fraction z=x.add(y);
        String s=z.display();
        System.out.println(s);
    }
}