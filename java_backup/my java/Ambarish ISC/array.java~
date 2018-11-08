import java.io.*;
class array
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,max,min,mid,t,f,f1,j,k;
t=mid=f=f1=k=0;
System.out.print("Enter the limit");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<n;i++)
{
 System.out.print("Enter the elements");
    a[i]=Integer.parseInt(br.readLine());
 
 //System.out.print(a[i]);
}
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
{max=a[i];
}
else if(a[i]<min)
{min=a[i];
}
}
mid=n/2;
t=mid;
int t1=mid-1;
for(i=max;i>=min;i--)
{
    for(j=0;j<n;j++)
    {
        if(a[j]==i)
        {
            if(f==0)
            {
                k=a[j];
                a[j]=a[t];
                a[t]=k;
            t++;
            f=1;
            f1=0;
            break;
        }
        else if(f1==0)
            {
                k=a[j];
                a[j]=a[t1];
                a[t1]=k;
            t1--;
            f=0;
            f1=1;
            break;
        }
    }
}
}
System.out.println("");
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}
   

 