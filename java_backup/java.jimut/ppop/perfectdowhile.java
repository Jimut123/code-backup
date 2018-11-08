import java.io.*;
class perfectdowhile
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i=1,n,s=0;
System.out.println("Enter any no:");
n=Integer.parseInt(cd.readLine());
do
{
if(n%i==0)
{
s=s+i;
}
i++;
}
while(i<n);
{
if(n==s)
System.out.println("Prfct");
else
System.out.println("Nt prfct");
}
}
}