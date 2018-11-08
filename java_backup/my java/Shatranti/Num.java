import java.io.*;
class Num
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int num=0;int i=0;
        String intVal;
        int max=0;
        System.out.println("Enter 10 nos");
        for (i=0;i<10;i++)
        {
           intVal=br.readLine();
           num=Integer.parseInt(intVal);
           if(num>max)
           max=num;
        }
        System.out.println("max no"+max);
        
        
    }
}