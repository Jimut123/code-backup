import java.io.*;
class notes
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n[]={1,2,5,10,20,50,100,500,1000};
        int m,s,i;
        System.out.println("Enter a amount");
        m = Integer.parseInt(cd.readLine());
        for(i=8;i>=0;i--)
        {
            s=m/n[i];
            System.out.println("No. of notes of Rs "+n[i]+" = "+s);
            m=m%n[i];
        }
    }
}
            