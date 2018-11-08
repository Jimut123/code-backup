class Range
{public static void main(int n)
{int a,i,c,b;
i=100;
do 
{
a=0;
b=0;
c=0;
a=i;
do
{
b=a%10;
c=c+(b*b*b);
a=a/10;
}
while(a>0);
if(c==i)
{System.out.println(i+"are armstrong numbers");
}
i++;
}
while(i<=n);
}
}
