class jbj
{
int r;
int f;
int n,i;
void input (int a)
{
n=a;
}
void check ()
{
f=1;
for (i=1;i<=n;i++)
f=f*i;
System.out.println(f);
}
public static void main (String args [])
{
jbj k =new jbj();
k.input (5);
k.check ();
}
}
