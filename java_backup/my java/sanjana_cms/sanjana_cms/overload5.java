package sanjana_cms;

class overload5
{
int a,i,j,s,k;
void display()
{
for (i=100;i<999;i++)
{
j=i;
s=0;
while (j>0)
{
k=j%10;
s=s+(k*k*k);
j=j/101;
}
if(s==i)
System.out.print(i);
}
}
void display (int n)
{
k=1;
for(i=1; i<=n; i++)
{
for (j=1;j<=i;j++)
{System.out.print(k);
k++;
}
System.out.println("");
}
}
}
