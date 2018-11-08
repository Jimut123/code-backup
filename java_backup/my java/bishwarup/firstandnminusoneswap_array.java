import java.io.*;
class firstandnminusone
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [100];
int n,i,s1,s2;
System.out.println("Give the term");
n=Integer.parseInt(br.readLine());
//input for array
for(i=0;i<n;i++)
{
System.out.println("Give the number");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("1 st element of array:"+a[0]);
System.out.println("Last element:"+a[n-1]);
}
}
import java.io.*;
class swaping
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("give values");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
System.out.println("Before swaping,a is "+a+" and b is "+b);
c=a;
a=b;
b=c;
System.out.println("After swaping,");
System.out.println("a is "+a);
System.out.println("b is "+b);
System.out.println("give values");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
System.out.println("Before swaping,a is "+a+" and b is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swaping,");
System.out.println("a is "+a);
System.out.println("b is "+b);
}
}
