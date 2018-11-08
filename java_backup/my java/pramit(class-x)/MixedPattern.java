import java.io.*;
class MixedPattern
{
public static void main(String[]args)throws IOException
{
int n,i,j,d,a;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader bb=new BufferedReader(aa);
System.out.print("Input range=");
n=Integer.parseInt(bb.readLine());
d=1;
a=97;
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
if(d%2!=0)
{
System.out.print(d+" ");
}
else if(a%2==0)
{
System.out.print((char) a+" ");
}
a++;
d++;
}
System.out.println();
}
}
}