import java.io.*;
class fibonacci
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,i;
void input()throws IOException
{
System.out.println("Enter the 1st number");
n=Integer.parseInt(input.readLine());
for(i=1;i<=n;i++)
{
System.out.println(fibo(i)+" ");
}
}
int fibo(int x)
{
if(x==0||x==1)
return 0;
else if(x==2)
return 1;
else
{
return(fibo(x-1)+fibo(x-2));
}
}
}
