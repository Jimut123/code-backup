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
