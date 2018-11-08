import java.io.*;
class binary_to_decimal
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        long l,d,s=0;
        int i=0,g;
        System.out.println("Enter the binary number:");
        l = Long.parseLong(cd.readLine());
        while(l!=0)
        {
            d=l%10;
            g=(int)d*((int)Math.pow(2,i));
            s=s+(long)g;
            l=l/10;
            i++;
        }
        System.out.println("Decimal number:"+s);
    }
}
        
