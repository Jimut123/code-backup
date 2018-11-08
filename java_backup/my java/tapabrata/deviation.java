import java.io.*;
class deviation
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{a[i]=Integer.parseInt(br.readLine());
System.out.println("Enter elements");
}
int s,e,m,p,min=0,t;
s=0;
e=n-1;
for(i=1;i<n;i++)
{min=a[s];
p=s;
for(j=s;j<=e;j++)
{if(a[j]<min)
{min=a[j];
p=j;
}
}
if(i%2==1)
{t=a[s];
a[s]=a[p];
a[p]=t;
s++;
}
else
{
t=a[e];
a[e]=a[p];
a[p]=t;
e--;
}
}
for(m=0;m<n;m++)
{System.out.println(a[m]);

}
}
}