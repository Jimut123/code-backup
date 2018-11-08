import java.io.*;
import java.lang.*;
class elevenArray
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
int i,j,k,f,f1,p;
System.out.println("Enter The Array Length");
int n=Integer.parseInt(Input.readLine());
int A[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter The Nos.");
A[i]=Integer.parseInt(Input.readLine());
}
k=1;
f=0;
f1=0;
p=0;
while(true)
{
f=0;
p=A[0]*k;

for(j=0;j<n;j++)
{
if(p%A[j]!=0)
{
//System.out.println(""+p);
f=1;
break;
}
}
if(f==0)
{
f1=1;
break;
}
k++;
}
if(f1==1)
{
System.out.println("L.C.M."+p);
}
}
}
