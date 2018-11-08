public class wordplay
{
public void run(String w)
{
int t=1;
for(int i=0;i<w.length();i++)
{
if(w.charAt(i)==' ')
{
t++;
}
}
String a[]=new String[t];
for(int i=0;i<t;i++)
{
a[i]="";
}
int h=0;
for(int i=0;i<w.length();i++)
{
if(w.charAt(i)==' ')
{
h++;
}
else
{
a[h]=a[h]+w.charAt(i);
}
}

for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i].length()>a[j].length())
{
String t2=a[j];
a[j]=a[i];
a[i]=t2;
}
}
}
int m=0;
String b[]=new String[a.length];
for(int i=0;i<t;i++)
{
b[i]="";
}
if(t%2==0)
{
m=t/2;
}
else
{
m=t/2+1;
}

b[m]=a[t-1];

int h2=-1;
int z=1;
int f=1;
for(int i=t-2;i>=0;i--)
{
if(f%2==0)
{
z++;

}
h2=h2*-1;
int p=m+(z*h2)-h2;

b[p]=a[i];
f++;
}

for(int i=0;i<m;i++)
{
System.out.print(" "+b[i]+" ");
}
System.out.print(" "+a[t-1]+" ");
for(int i=m;i<t;i++)
{
System.out.print(" "+b[i]+" ");
}
}
}


