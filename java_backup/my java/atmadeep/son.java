import java.io.*;
public class son
{
int c=0,s=0;
son(int sons)
{
s=sons;
c=s*s;
}
int a[]=new int[c];
public int great(int n)
{
int g=0;
for(int i=(c-1);i>=0;i--)
{
if(a[i]<n)
{
g=a[i];
a[i]=0;
return g;
}
}
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
public void main()throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.println("Enter the number of sons");
int son=Integer.parseInt(input.readLine());
soncow ob=new soncow(son);
int p=(c*(c+1))/(2*son);
int q=p;
for(int k=0;k<son;k++)
{
p=q;
System.out.println();
for(int f=0;f<son;f++)
{
System.out.print(""+ob.great(p)+"");
p=p-ob.great(p);
if(f==(s-2))
{
h=ob.last2(p);
System.out.print(""+(h%10)+"");
System.out.print(""+(h/10)+"");
break;
}
break;
}
}
}
}
