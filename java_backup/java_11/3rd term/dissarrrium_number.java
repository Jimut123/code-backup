import java.io.*;
class dissarrrium_number
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,c=0,n1,d,s=0,j=0;
        System.out.println("Enter a number:");
        n=Integer.parseInt(cd.readLine());
        n1=n;
        while(n1!=0)
        {
            d=n1%10;
            s=(s*10)+d;
            n1=n1/10;
        }
        n1=s;
        while(n1!=0)
        {
            d=n1%10;
            c++;
            j=j+(int)(Math.pow(d,c));
            n1=n1/10;
        }
        if(j==n)
        {
            System.out.println("Dicerium number.");
        }
        else
        {
            System.out.println("Not a Dicerium number.");
        }
    }
}
