import java.io.*;
class series1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,s,p=0;
       
        for(i=0;i<=9;i++)
        {
            s = (int)Math.pow(10,i);
            p = p+s;
            
            System.out.print(p+" ");
            
        }
}
}