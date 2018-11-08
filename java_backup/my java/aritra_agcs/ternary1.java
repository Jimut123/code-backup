import java.io.*;
class ternary1
{
    public void main()throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.println("Enter any number");
        a=Integer.parseInt(BR.readLine());
        b=(a<30)?9:(a<50)?11:18;
        System.out.println("the value of b is "+b);
    }
}    
    