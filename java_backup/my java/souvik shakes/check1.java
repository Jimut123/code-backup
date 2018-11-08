import java.io.*;
class check1
{
    public static void main (String args[])
               throws IOException
{               
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader vr = new BufferedReader(isr);
    int a;
    System.out.println("Enter data:");
    a=Integer.parseInt(vr.readLine());
    if(a % 2 == 0)
    System.out.print("Even nomber");
    else
    System.out.print("Odd number");
}
}