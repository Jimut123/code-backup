class Subham
{
int r;
int f;
int n;
int i;
void input (int a)
{
n=a;
}
void check()
{
f=1;
for(i=1;i<=n;i++)
f=f*i;
System.out.println (f);
}
public static void main(String args[])
{
Subham B =new Subham();
B.input (5);
B.check ();
}
}
