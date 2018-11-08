import java.io.*;
class abc1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int n,i,f,v;
System.out.println("Give nos. of terms:");
n=Integer.parseInt(br.readLine());
int a[]=new int[n]; 

for(i=0;i<n;i++)
{
System.out.println("Enter elements");
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter searching element");
v=Integer.parseInt(br.readLine());
f=0;
for(i=0;i<n;i++)
{
if(a[i]==v)
{
f=1;
break;
}
}
if(f==1)
System.out.println("found");
else
System.out.println("not found");
}
}

