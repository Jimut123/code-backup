import java.io.*;
class twinpr
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [100];
int i,p,j,p1,v,f,n;
void input()throws IOException
{
System.out.println("give the array term:");
n=Integer.parseInt(br.readLine());
System.out.println("give the array elements:");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
System.out.print(a[i]+",");
System.out.println("");
twin_pr();
//prime_check();
}
void twin_pr()
{
for(i=0;i<n;i++)
{
p=prime_check(a[i]);
if(p==0)
{
for(j=i+1;j<n;j++)
{
p1=prime_check(a[j]);
if(p1==0)
{
v=a[i]-a[j];
if(v==2 || v==-2)
{
System.out.println(a[i]+","+a[j]);
System.out.println("");
}
}
}

}
}
}
int prime_check(int v1)
{
f=0;
//System.out.println(v1);
for(int j=2;j<v1;j++)
{
if(v1%j==0)
{
f=1;
break;
}
}
return f;
}
}
