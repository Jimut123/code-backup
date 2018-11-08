import java.io.*;
import java.lang.*;
class print
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int a=4,b=2;
        double c=4.9,k=5.000001,m=-5.5000001;
        String r="NEW DELHI",h="New delhi";
        System.out.println("\f");
        System.out.println(r.length()+h.length());
        System.out.println(r.length()+h.length()+"f");
        System.out.println("f"+r.length()+h.length());
        System.out.println(r.compareTo(h));
        System.out.println(r.equals(h));
        System.out.println(Math.rint(c));
        System.out.println(Math.rint(m));
        System.out.println((Math.abs(m)));
        System.out.println( Math.rint(Math.abs(m)));
        System.out.println( Math.round(m));
        System.out.println(Math.floor(c));
        System.out.println(Math.ceil(c));
        System.out.println(+4+2);
        System.out.println(4+2);
        System.out.println((4+2));
        System.out.println("four: "+4+2);
        System.out.println("four"+(4+2));
        System.out.println(a+b);
        System.out.println((a+b));
        System.out.println(c+a);
        System.out.println(+c+a);
        System.out.println(9.000000000001+c);
    }
}
