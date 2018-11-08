

public class Diam
{public static void main(int n)
{int i=1,j,k=0,a=1;
for(i=1;i>0;)
{for(j=i;j<=n;j++)
System.out.print(" ");
for(a=(i*2)-1;a>0;a--)
System.out.print("*");
if(i==n)
k++;
if(k==0)
i++;
else
i--;
System.out.print("\n");
}
}
}