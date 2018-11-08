import java.io.*;
class rec_fibon
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,j,k,l,n;
void input()throws IOException
{
System.out.println("Enter the no.:");
n=Integer.parseInt(input.readLine());
for(i=1;i<=n;i++)
{
k=fibo(i);
System.out.println(k);
}
}
int fibo(int x)
{
if(x==1)
return 0;
else if(x==2)
return 1;
else
return(fibo(x-1)+fibo(x-2));
}
}

