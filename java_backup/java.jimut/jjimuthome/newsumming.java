import java.io.*;
class newsumming
{
public static void main (String args []) throws IOException 
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,k,k1,s,s1,m;
s=0;
for(i=1;i<=10;i++)
{
System.out.println("Enter values:");
k=Integer.parseInt(br.readLine());
k1=k;
s1=0;
while(k1>0)
{
m=k1%10;
s1=s1+(m*m*m);
k1=k1/10;
}
if(s1==k)
{
s=s+k;
}
}
System.out.println("Total sum of all armstrong numbers:"+s);
}
}