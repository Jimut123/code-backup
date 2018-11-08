import java.io.*;
class merge
{public static void main(String args[])throws   IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
int a[]=new int[m];
int b[]=new int[n];
int c[]=new int[m+n];
int max,min,i,j;int t;
for(i=0;i<m;i++)
{a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
max=min=a[0];
for(i=0;i<m;i++)
{if(a[i]>max)
{max=a[i];
}else
if(a[i]<min)
{min=a[i];
}
}
for(i=0;i<n;i++)
{b[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
max=min=b[0];
for(i=0;i<n;i++)
{if(b[i]>max)
{max=b[i];
}
else
if(b[i]<min)
{b[i]=min;
}
}
t=0;
for(i=min;i<max;i++)
{for(j=0;j<n;j++)
{if(a[j]==t)
{c[t++]=a[j];
}
}
}
for(i=max;i<min;i++)
{for(j=0;j<n;j++)
{if(b[j]==i)
{c[t++]=b[j];
}
}
}
for(i=0;i<t;i++)
{System.out.println(c);
}
}
}