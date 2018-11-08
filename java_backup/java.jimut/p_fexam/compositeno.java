import java.io.*;
class compositeno
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,n,f=0;
System.out.println("Enter any number");
n=Integer.parseInt(cd.readLine());
for(i=2;i<n;i++)
{
if(n%i==0)
{
f=f+1;
}
}
if(f>1)
{
System.out.println("It is Composite Number");
}
else
System.out.println("It is not composite number");
}
}