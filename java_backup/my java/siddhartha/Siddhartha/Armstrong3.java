class Armstrong3
{public static void main()
{int a,b,i,c;
 i=100;
do
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
{System.out.println(i+" is an Armstrong number");
}
i++;
}
while(i<=500);
}
}

