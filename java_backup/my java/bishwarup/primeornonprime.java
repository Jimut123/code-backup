class primeornonprime
{
public static void main(int n)
{
int f=0,j,i=1;
for(j=2;j<n;j++)
if(n%i==0)
{
f=1;
break;
}
if(f==0)
System.out.print("PRimE");
else
System.out.print("Non-PRimE");
}
}
