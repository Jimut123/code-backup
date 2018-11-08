import java.io.*;
class reverse
{public static void main(String args[])throws   IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i,t,j;
for(i=0;i<n;i++)
{a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
for(i=0,j=n-1;i<n/2;i++,j--)
{t=a[i];
a[i]=a[j];
a[j]=t;
}
for(i=0;i<n;i++)
{System.out.println(a[i]);
}
}
}