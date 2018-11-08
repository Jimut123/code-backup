import java.io.*;
class largest
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter nos. of elements");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter elements");
a[i]=Integer.parseInt(br.readLine());
}
int max,max1=0,pos,pos1=0,rev,k,k1,pos2,d,p=0;
for(i=0;i<n;i++)
{k=a[i];
max=0;
pos=0;
rev=0;
while(k>0)
{k1=k%10;
rev=(rev*10)+k1;
k=k/10;
}
pos2=0;
while(rev>0)
{d=rev%10;
pos=pos+1;
if(d>max)
{pos2=pos;
max=d;
}
rev=rev/10;
}
System.out.println(a[i] +","+ max +","+ pos2);
if(max>max1)
{max1=max;
p=a[i];
}
}
System.out.println(max1 +","+ p);
}
}

