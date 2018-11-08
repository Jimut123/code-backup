package finalprojectwork.threefunction;


import java.io.*;
public class hcflcm
{
int hlcm(int a,int b)
{
int i,hcf,p;
hcf=0;
p=a*b;
for(i=1;i<p;i++)
{
if((a%i==0)&&(b%i==0))
hcf=i;
}
return (hcf);
}
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int m,n,p,k,c;
k=0;c=0;
hcflcm ob=new hcflcm();
System.out.println("Enter two numbers");
m=Integer.parseInt(cd.readLine());
n=Integer.parseInt(cd.readLine());
p=m*n;
k=ob.hlcm(m,n);
c=p/k;
System.out.println("HCF="+k);
System.out.println("LCM="+c);
}
}