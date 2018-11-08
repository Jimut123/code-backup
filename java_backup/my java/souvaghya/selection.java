import java.io.*;
class selection
{
public static void main()throws IOException
{
    int t,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[6];
for(i=0;i<6;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<6-1;i++)
{

for(j=i+1;j<6;j++)
if(a[j]<a[j+1])

t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
for(i=0;i<6;i++)
System.out.print(a[i]);
}
}
