import java.io.*;
class output
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int p=Byte.parseByte(in.readLine());
        int a=2,b=3,c=4,d=5;
        System.out.println(""+a+b);
        System.out.println(a+b+(c+d)+a+b);
    }
}