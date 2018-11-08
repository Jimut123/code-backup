import java.io.*;
class consequtive
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[10];
int i,j,t;
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<10-1;i++)
for(j=i+1;j<10;j++)
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
for(i=0;i<10;i++)
System.out.println(a[i]);
}
}