import java.io.*;
class maximum
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c;
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        System.out.println("Enter first side");
        System.out.println("Enter second side");
        System.out.println("Enter third side");
        if(a==b && b==c && c==a)
        System.out.println("It is an equilateral triangle");
        else
        if(a==b ||a==c || b==c)
        System.out.println("It is an isoceles triangle");
        else
        if(a!=b && b!=c && c!=a)
        System.out.println("It is a scalene triangle");
        else
        System.out.println("Sorry, triangle is not possible");
    }//end of main
}//end of class