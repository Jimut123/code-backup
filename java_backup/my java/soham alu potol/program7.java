import java.io.*;
class program7
{
public static void main(String args[])throws IOException
{
int n,k,n1,k1,n2,f,f1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number ");
n=Integer.parseInt(br.readLine());
f=0;
n2=n;
while(n>0)
{
k=n%10;
f1=1;
n1=n/10;
while(n1>0)
{
k1=n1%10;
if(k1==k)
f1++;
n1=n1/10;
}
if(f1>1)
{
    f=1;
break;
}
n=n/10;
}
if(f==0)
System.out.println(n2+"(Unique number)");
else
System.out.println(n2+"(Not Unique)");
 }
}

