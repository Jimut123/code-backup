import java.io.*;
class defaultFunction
{
void power(int m,int n=2);
void power(int m,int n)
{
int d=1,i;
for(i=1;i<=n;i++)
{
x=x*i;
}
System.out.println("The No"+x);
}
void power(int m,int n)
{
int k;
k=math.pow(m,n);
System.out.println("The No."+k);
}
}
class defaultFunction
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int k;
System.out.println("Enter The Value Of m");
int m=Integer.parseInt(Input.readLine());
System.out.println("Enter The Value Of n");
int n=Integer.parseInt(Input.readLine());
defaultFunction s=new defaultFunction();
s.power(int m);
s.power(int m,int n);
}
}