import java.io.*;
class amicable
{public static void main(String args[])throws   IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,l,s,s1;s=s1=0;int n=Integer.parseInt(br.readLine());
 int x=Integer.parseInt(br.readLine());
 int a[]=new int[x];
for( i=0;i<x;i++)
{a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements of the array");
}
for(i=0;i<n;i++)
{s=0;
for(j=1;j<a[i];j++)
if(a[i]%j==0)
{s=s+j;
}
for(k=i+1;k<n;k++)
{s1=0;
for(l=1;l<a[k];l++)
{if(a[k]%l==0)
{s1=s1+l;
}
if(s1==a[i]&&s==a[k])
System.out.println(a[i]+"," +a[k]);
}
}
}
}
}

