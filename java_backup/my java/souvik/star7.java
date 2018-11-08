class star7
{

public static void main (String args[])
{
int i,j,m;

for(i=1;i<=5;i++)
{
if(i%2==0)
m=0;
else
m=1;
for(j=1;j<=i;j++) 
{
System.out.print(m);
if(m==0)
m=1;
else
m=0;
}
System.out.println("");
}
}
}
