package testpaper.proj;

import java.io.*;
class element extends ABS
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[];
int i,j,n;
void input(int n1)throws IOException
{
n=n1;
a=new int [n];
System.out.println("give the array elements :");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("frequency of elements : ");
for(i=0;i<n;i++)
System.out.println("element : "+a[i]+"  frequency : "+search(a[i])+" time(s) ");
}
int search(int m)
{
int c=0;
for(j=0;j<n;j++)
if(a[j]==m)
c++;
return c;
}
}
