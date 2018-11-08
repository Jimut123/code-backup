package iisscc;
import iisscc.factorial.factor;
class sum
{
public static void main(int n)
{
iisscc.factorial.factor a=new iisscc.factorial.factor();
double s=0.0;
int i,f=1;
for(i=1;i<=n;i++)
s=s+(((double)Math.pow(2,i))/((double)a.fact(i)));
System.out.println("Sum= "+s);
}
}
