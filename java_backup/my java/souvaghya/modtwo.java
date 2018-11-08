class modtwo
{
public static void main(int n)
{
int m;
for(int i=1;i<=n;i++)
{
if(i%2 !=0)
m=1;
else
m=0;
for(int j=1;j<=i;j++)
{
System.out.print(m);
if(m==1)
m=0;
else
m=1;
}
System.out.println("");
}

}
}