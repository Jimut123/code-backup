import java.io.*;
class selectionsortdescending
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int m[]=new int[10];
int i,j,t,max;
System.out.println("Enter 10 nos.:");
for(i=0;i<=9;i++)
{
m[i]=Integer.parseInt(cd.readLine());
}
for(i=0;i<=9;i++)
{
max=i;
for(j=i+1;j<=9;j++)
{
if(m[j]>m[max])
{
max=j;
}
}
t=m[i];
m[i]=m[max];
m[max]=t;
}
System.out.print("Nos. in descending order are=");
for(i=0;i<=9;i++)
System.out.print(m[i]+" ");
}
}