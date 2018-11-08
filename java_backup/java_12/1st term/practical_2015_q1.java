import java.io.*;
class practical_2015_q1
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int M,N,i,n,c=0,d,s=0;
System.out.println("Enter the values of M and N:");
M=Integer.parseInt(cd.readLine());
N=Integer.parseInt(cd.readLine());
if((M>=100)&&(M<=10000))
{
    for(i=M;i<=10000;i++)
    {
        n=i;
        while(n!=0)
        {
        d=n%10;
        c=c+d;
        s++;
        n=n/10;
       }
       if(c==N)
       {
           System.out.println("The required number - "+i);
           System.out.println("The number of digits - "+s);
           break;
        }
        c=0;
        s=0;
    }
}
else
{
    System.out.println("INVALID INPUT");
}
}
}
