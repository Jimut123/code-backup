import java.io.*;
class question2009
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value of n=");
int n,i,j;
n=Integer.parseInt(br.readLine());
System.out.println("*****MENU*****");
System.out.println("1.TRIANGLE");
System.out.println("2.INVERTED TRIANGLE");
System.out.println();
System.out.println("ENTER YOUR CHOICE");
int ch;
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print(j);
System.out.println();
}
break;
case 2:
for(i=n;i>=1;i--)
{
for(j=i;j>=1;j--)
System.out.print(j);
System.out.println("");
}
}
}
}

