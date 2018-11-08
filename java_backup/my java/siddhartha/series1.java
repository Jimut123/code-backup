
class series1
{
public static void main(String args[])
{
int i,j,k,k1,k2;
k1=0;
k=0;
k2=1;
for(i=1;i<=4;i++)
{
if(i==4)
k1=k1+1;
else
k1=k1+2;
k2=i;
for(j=1;j<=k1;j++)
{
if(j%2!=0)
{
if(k2>10)
System.out.print((k2-1)+" ");
else
System.out.print(k2+" ");

}
else
System.out.print("*");
k2=i+(j+1);
}
System.out.println("");
}
}
}
