public class run_around
{
int d[];
public void amlan(int n)
{
int t=0;
int m=n;
while(m>0)
{
m=m/10;
t++;
}

int h=t-1;
d=new int[t+1];
int m2=n;
while(m2>0)
{
d[h]=m2%10;
h--;
m2=m2/10;
}

h=t;
for(int i=1;i>0;i++)
{
d[h]=sumup(h,t);
if(d[h]==n)
{
System.out.println("run around");
break;
}
else if(d[h]>n)
{
System.out.println("dont run around");
break;
}

if(h==t)
{
h=0;
}
else
{
h++;
}
}
}

public int sumup(int u,int t)
{
int c=0;
int v=0;
for(int i=0;i<d.length;i++)
{
if(u==0)
{
v=t;
}
else
{
v=u-1;
}

if(i!=u)

{
c=c+d[i];

}
}
return c;
}
}
