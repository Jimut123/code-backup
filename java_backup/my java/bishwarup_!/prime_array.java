import java.io.*;
class prime_array
{
public static void main(String args[]) throws IOException
{
int a[]=new int[50];
int f=0,j,i=1,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print(" GIVE TERM");
n=Integer.parseInt(br.readLine());
for(j=0;j<n;j++)
a[i]=Integer.parseInt(br.readLine());
//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
f=0;
for(j=2;j<a[i];j++)
if(a[i]%j==0)
{
f=1;
break;
}
if(f==0)
System.out.println("PRimE"+a[i]);
}

}
}


