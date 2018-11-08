import java.io.* ;
public class automorphic
{
public static void main (int n)
{
int t,m,m1,s,f,k,s1,p;
m=n*n;
m1 = m;
s =0;
f =0;
while(m1 >0)
{
k = m1 % 10;
s = (s*10)+k;
s1 =s;
t =0;
while (s1 > 0)
{
p = s1 % 10;
t = (t * 10)+p;
s1 = s1/10;
}
if (t == n)
{
f = 1;
break;
}
m1 = m1/10;
}
if (f == 1)
System.out.println("automorphic no" + n);
else
System.out.println("non automorphic no" + n);
}
}

