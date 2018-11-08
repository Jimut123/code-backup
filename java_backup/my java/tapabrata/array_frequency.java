import java.io.*;
class array_frequency
{public static void main(String args[])throws IOException
{BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i,j,max,min;
for(i=0;i<n;i++)
{a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
max=min=a[0];
for(i=0;i<n;i++)
{if(a[i]>max)
max=a[i];
else
if(a[i]<min)
min=a[i];
}
for(i=max;i>=min;i--)
{int f=0;
for(j=0;j<n;j++)
{if(i==a[j])
{f++;
}
}
System.out.println(i+  "Freq "  +f);
}
}
}