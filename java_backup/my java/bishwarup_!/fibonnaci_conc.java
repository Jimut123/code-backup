class fibonnaci_conc
{
int f1,f2,i,f3,m;
fibonnaci_conc(int n)
{
f1=0;
f2=1;
m=n;
}
void calc()
{
System.out.print(f1+" ,"+f2);
for(i=1;i<=m-2;i++)
{
f3=f1+f2;
System.out.print(","+f3);
f1=f2;
f2=f3;
}
}
}
