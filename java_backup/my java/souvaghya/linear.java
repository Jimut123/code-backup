import java.io.*;
class linear
{
public static void main(String args[])throws IOException
{
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[6];
int i,j,t;
for(i=0;i<6;i++)
a[i]=Integer.parseInt(br.readLine());
{
for(i=0;i<6-1;i++)
for(j=i+1;j<6;j++)
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
for(i=0;i<6;i++)
System.out.print(a[i]);
}
}
}