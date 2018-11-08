class Hollow
{public static void main(int n)
{int i=0,j=0,k=0;
for(i=0;i<n;i++)
{for(j=0;j<n-i;j++)
{System.out.print("*");
}
for(k=0;k<2*(i-1)+2;k++)
{System.out.print(" ");
}
for(j=0;j<n-i;j++)
{System.out.print("*");
}
System.out.println();
}
for(i=n;i>0;i--)
{for(j=n-i;j>=0;j--)
{System.out.print("*");
}
for(k=2*(i-1)+2;k>2;k--)
{System.out.print(" ");
}
for(j=n-i;j>=0;j--)
{System.out.print("*");
}
System.out.println();
}
}
}

