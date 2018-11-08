// more than or equal to 3 and all the digits are same eg.666
import java.io.*;
class Nelson_number
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int n,s=0,n1,d,k,v=1;
System.out.println("Enter a number:");
n=Integer.parseInt(cd.readLine());
n1=n;
while(n1!=0)
{
    d=n1%10;
    s=s+1;
    n1=n1/10;
}
n1=n;
if(s>=3)
{
    d=n1%10;
    while(n1!=0)
{
    k=n1%10;
    if(k!=d)
    {
        v=0;
    }
    s=s+1;
    n1=n1/10;
}
if(v==1)
{
    System.out.println("The number is Nelson.");
}
else
{
     System.out.println("The number is not Nelson.");
}
}
else
{
     System.out.println("The number is not Nelson.");
}

}
}
