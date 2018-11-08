import java.io.*;
class year
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a;
        System.out.println("Enter data");
        a=Integer.parseInt(br.readLine());
        if(a%4==0||a%400==0)
        
            System.out.println("leap year");
            else
            System.out.println("not leap year");
        
    }
}
            