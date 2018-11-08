public class Unique_Digit_Integer
{
public void main(int m, int n)
{
if(m<0 || n<0 || m>n)
System.out.println("Non-Positive inputs or "+'\n'+"m is greater than n then reinput");
else
{
System.out.println("The unique digit integers are:");
int freq=0,copy,c,f;
int a[]=new int [size(n)];
for(int i=m;i<=n;i++)
{
f=0;c=0;
copy=i;
while(copy>0)
{
a[c++]=copy%10;
copy=copy/10;
}
if(a[a.length-1]==0)
f++;
for(int k=0;k<a.length;k++)
{
for(int p=0;p<a.length;p++)
{
if(k!=p)
{
if(a[k]==a[p])
{
f++;
break;
}
}
}
}
if(f==0)
{
freq++;
System.out.println(i);
}
}
System.out.println("Total number of unique digit integers(Frequency) "+freq);
}
}
public int size(int s)
{
int d;
int count=0;
while(s>0)
{
d=s%10;
count++;
s=s/10;
}
return count;
}
}
