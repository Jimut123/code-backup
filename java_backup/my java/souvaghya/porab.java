class porab
{
public static void main(String args[])
{
int l,i,j,n,f,sp,m;
m=65;
l=69;sp=0;
//System.out.println("abc"+(char)m);
for(i=1;i<=5;i++)
{
for(j=m;j<=l;j++)
System.out.print((char)j+" ");
for(n=1;n<=sp;n++)
System.out.print(" ");
if(i==1)
j=j-2;
else
j=j-1;
while(j>=65)
{
System.out.print((char)j+" ");
j--;
}
sp=sp+3;
l=l-1;
//m=65;
System.out.println("");
}
}
}
