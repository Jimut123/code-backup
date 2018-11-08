import java.util.*;
public class ar_srt_freq
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter limit : ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("no ? : ");
a[i]=sc.nextInt();
}
int f=0,s=0;

for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
f=0;
s=0;
for(int k=0;k<n;k++)
{
if(a[j]==a[k])
{
f=f+1;
}
if(a[j+1]==a[k])
{
s=s+1;
}
}
if(f<s)
{
int h=a[j];
a[j]=a[j+1];
a[j+1]=h;
}
}

}
int val=a[0];
System.out.print(a[0]+" , ");
for(int i=1;i<n;i++)
{
if(a[i]!=val)
{
System.out.print(a[i]+" , ");
val=a[i];
}
}
}
}

