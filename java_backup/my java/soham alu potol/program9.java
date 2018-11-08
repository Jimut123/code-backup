import java.io.*;
class program9
{
public static void main (String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c,n1,n,k,m,i;
System.out.println("Enter multi digit number(odd length):");
n=Integer.parseInt(br.readLine());
k=0;
c=0;
n1=n;
while(n>0)
{
k=n%10;
c++;
n=n/10;
}
System.out.println(c);
if(c%2==0)
m=(c/2);
else
m=(c/2)+1;
i=0;n=n1;
while(n>0)
{
k=n%10;
i++;
if(i==m)
break;
n=n/10;
}
System.out.print(k);
}
}

