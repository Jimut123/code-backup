class LCM
{
public static void main(int a,int b)
{
int i,high,low;
if (a<b)
{
high=a;low=b;
}
else
{
high=b;low=a;
}
for(i=high;i<=a*b;i=i+high)
{
if(i%low==0)
break;
}
System.out.print("L>C>M =" +i);
}
}