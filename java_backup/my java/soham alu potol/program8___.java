import java.io.*;
class program8___
{
public static void main(String args[])throws IOException
{
int rev,k,i,j;int n,n1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the beginning range:");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the ending range:");
n1=Integer.parseInt(br.readLine());
for(i=n;i<=n1;i++)
{
rev=0;
j=i;
while(j>0)
{
k=j%10;
rev=(rev*10)+k;
j=j/10;
}
if(rev==i)
System.out.println("Palindrome "+i);
}
}
}