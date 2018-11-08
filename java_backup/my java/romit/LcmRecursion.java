import java.io.*;
class LcmRecursion
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,m,n,k;
void input()throws IOException
{
System.out.println("Enter The Nos");
m=Integer.parseInt(Input.readLine());
n=Integer.parseInt(Input.readLine());
i=1;
k=lcm(m,i,n);
System.out.println(k);
}
int lcm(int x,int i,int y)
{
if((x*i)%y==0)
{
return (x*i);
}
else
{
return(lcm(x,(i+1),y));
}
}
}
