import java.io.*;
class array5
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [100];
int n,i,b,c,p,max,min;
System.out.println("Give the term");
n=Integer.parseInt(br.readLine());
b=c=p=0;
//input for array
for(i=0;i<n;i++)
{
System.out.println("Give the number");
a[i]=Integer.parseInt(br.readLine());
}
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
{
max=a[i];
b=i;
}
if(a[i]<min)
{
min=a[i];
p=i;
}
}
System.out.println("max:"+max);
System.out.println("max position:"+b);
System.out.println("min:"+min);
System.out.println("min position:"+p);
}
}
