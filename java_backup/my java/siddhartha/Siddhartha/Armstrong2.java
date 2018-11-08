class Armstrong2
{public static void main()
{int i,a,b,c;
for(i=100;i<=1000;i++)
{a=0;
b=0;
c=0;
a=i;
while(a>0)
{ 
b=a%10;
c=c+(b*b*b);
a=a/10;
}
if(c==i)
{System.out.println(i+" are the Armstrong numbers");
}
}
}
}
