import java.io.*;
class search_array
{
public static void main(String args[])throws IOException
{
int a[]=new int [50];
int f=0,i=0,n,v;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give nos to input:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("Give nos to find:");
v=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(a[i]==v)
{ 
f=1;
break;
}
}
if(f==1)
System.out.println(" ElEmeNt FouNd"+v);
else
System.out.println("ELemNt NOt FouNd"+v);
}
}