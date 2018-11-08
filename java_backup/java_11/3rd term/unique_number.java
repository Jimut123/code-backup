import java.io.*;
class unique_number
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int n,n1,s,c=0,d,j=0,i;
System.out.println("Enter a number:");
n1=Integer.parseInt(cd.readLine());
n=n1;
for(i=0;i<10;i++)
{
    while(n!=0)
    {
        d=n%10;
        if(d==i)
        c++;
        if(c>1)
        j=1;
        n=n/10;
    }
    n=n1;
    c=0;
}
if(j==1)
{
    System.out.println("The number is not unique:");
}
else
{
    System.out.println("The number is unique:");
}
}
}