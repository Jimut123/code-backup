
import java.io.*;
import java.lang.*;
class fsum1
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
int c,n,k,l=0,a=0,s;
System.out.println("Enter The No.");
n=Integer.parseInt(Input.readLine());
k=n%10;
l=n/10;
s=0;
while(l>0)
{
s=l%10;
l=l/10;
}
c=sum(k,s);
System.out.println("The SuM Value:"+c);
}
int sum(int x,int z)
{
int w=0;
w=x+z;
return w;
}
}

 