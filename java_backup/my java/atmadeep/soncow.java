import java.io.*;
public class soncow
{
int c=0,s=0;
int a[]=new int[100];
soncow(int sons)
{
s=sons;
c=s*s;
}
public int great(int n)
{
int g=0;
//System.out.println(n);
for(int i=(c-1);i>=0;i--)
{
//System.out.println(a[i]);
if(a[i]<n)
{
g=a[i];
a[i]=0;
return g;
}
//else
 //break;
}
return g;
}
public int last2(int m)
{
int k=0,d=0;
for(int l=2;;l++)
{
k=a[m-l];
if(k!=0)
{
for(int j=(m-(l+1));j>=0;j--)
{
if((a[j]+k)==m)
{
d=k*10+a[j];
return d;
}
}
}
}
}

}
