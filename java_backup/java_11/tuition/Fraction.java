import java.io.*;
class Fraction
{
    int num,den;
    void get()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the numerator:");
        num = Integer.parseInt(cd.readLine());
        System.out.println("Enter the denominator:");
        den = Integer.parseInt(cd.readLine());
    }
    void add(Fraction a ,Fraction b)
    {
        num = a.num*b.den;
        num = num+b.num*a.den;
        den = a.den*b.den;
    }
    void display()
    {
        System.out.println(num);
        System.out.println("-");
        System.out.println(den);
    }
}