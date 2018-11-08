
class hcf
{
public static void main (int a,int b)
{
int k;
while(a%b!=0)
{
k=a%b;
a=b;
b=k;
}
System.out.println(b);
}
}
