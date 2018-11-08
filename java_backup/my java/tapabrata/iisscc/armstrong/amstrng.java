package iisscc.armstrong;
public class amstrng
{ public int fun(int a)
{
int s1=0;int k1;
while(a>0)
{
k1=a%10;
s1=s1+(k1*k1*k1);
a=a/10;
}
if(s1==a)
//System.out.println("armstrong numbers:");
System.out.println(s1+",");
System.out.println("");
return s1;
}
}
