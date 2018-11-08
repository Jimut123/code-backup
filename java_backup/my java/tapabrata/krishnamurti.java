class krishnamurti
{public static void main(int m,int n)
{int i,f,d,j;
for(i=m;i<=n;i++)
{int k=i;
int s=0;
while(k>0)
{d=k%10;
f=1;
for(j=1;j<=d;j++)
f=f*j;
s=s+f;
k=k/10;
}
if(s==m)
System.out.println(i);
}
}
}