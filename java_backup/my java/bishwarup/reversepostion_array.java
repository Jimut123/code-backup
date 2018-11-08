import java.io.*;
class reversepostion_array
{
public static void main(String args[])throws IOException
{
int a[]=new int[50];
int d=0,r=0,n,j=0,t=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give nos of element:");
n=Integer.parseInt(br.readLine());
for(d=0;d<n;d++)
{
System.out.println("Give value:");
a[d]=Integer.parseInt(br.readLine());
}
j=n-1;
for(d=0;d<=n/2;d++)
{
t=a[d];
a[d]=a[j];
a[j]=t;
j--;

}
for(d=0;d<n;d++)
System.out.println(a[d]);
}
}