import java.io.*;
class smith_number
{
public void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,j,s,s1,k=0,n1;
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
n1=n;
s=s1=0;
while(n>1)
{
  for(j=2;j<=n;j++)
   {
     if(n%j==0)
     {
     s=s+digsum(j);
     break;
    }
}
    n=n/j;
    //System.out.println(n);
}

s1=0;
k=0;
while(n1>0)
{
    k=n1%10;
    s1=s1+k;
    n1=n1/10;
}
//System.out.println(s);
//System.out.println(s1);
if(s==s1)
System.out.print("SMITH NUMBER");
else
System.out.print("NOT A SMITH NUMBER");
}
int digsum(int x)
{
  int k=0,k1;
   while(x>0)
   {
     k1=x%10;
     k=k+k1;
     x=x/10;
    }
    return k;
}}
