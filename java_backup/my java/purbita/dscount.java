import java.io.*;
class dscount
{
public static void main (String args[])throws IOException
{
    double d,dp,a;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    a= Double.parseDouble(br.readLine ());
    System.out.println("Enter amount"+a);
    d=0;
    if (a<=2000)
    d=(10.0/100)*a;
    else if (a>=2001 & a<=5000)
    d=(15.0/100)*a;
    else if (a>=5001 &a<=10000)
    d=(25.0/100)*a;
    else if (a>=10001)
    d=(30.0/100)*a;
    dp=(a-d);
    System.out.println("Discount"+d);
    System.out.println("Discounted price"+dp);
}
}