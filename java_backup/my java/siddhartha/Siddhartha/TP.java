class TP
{public static void main(int n)
{int a=1,b=0,i,j;
i=2;
do
{
int c=0;
j=2;
while(j<=i/2)
{
if(i%j==0)
c=1;
j++;
break;
}
if(c==0)
{
 b=i;
if((b-a)==2)
System.out.println("Twin Prime no.s are="+a+"   "+b);
a=b;
}
i++;
}
while(i<=n);
}
}






