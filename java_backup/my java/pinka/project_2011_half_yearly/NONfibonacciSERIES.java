package project_2011_half_yearly;

import java.io.*;
class NONfibonacciSERIES
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,f,f1,f2,k,i;
System.out.println("Give the term");
n=Integer.parseInt(br.readLine());
f=0;
f1=1;
System.out.println("non fibonacci series:");
for(i=1;i<=(n-2);i++)
{
f2=f+f1;
k=f1+1;
while(k<f2)
{
System.out.print(k+",");
k++;
}
f=f1;
f1=f2;
}
}
}
