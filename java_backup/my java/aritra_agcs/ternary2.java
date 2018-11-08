import java.io.*;
class ternary2
{
    public void main()throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        System.out.println("Enter any number");
        a=Integer.parseInt(BR.readLine());
        b=(a<100)?a*10:(a<250)?a*15:(a<300)?a*20:a*30;
        System.out.println("the value of b is "+b);
    }
}    
    