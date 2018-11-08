class series_c
{
public static void main(int n)
{
int f1=0,f2=1,f3,i;
System.out.print(f1+","+f2);
for(i=1;i<=n-2;i++)
{
f3=f1+f2;
System.out.print(","+f3);
f1=f2;
f2=f3;
}
}
}


