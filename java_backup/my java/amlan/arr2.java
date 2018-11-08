
import java.io.*;
class arr2
{
public static void main(String args[])throws IOException
{
int a[]=new int[100];
int i,n,max,min,t,j,t1,c,t2,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter terms:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.println("Give Value at room no:"+" "+i);
a[i]=Integer.parseInt(br.readLine());
}
max=min=a[0];
for(i=0;i<n;i++)
{
if(a[i]>max)
max=a[i];
else
if(a[i]<min)
min=a[i];
}
t=n/2;
t1=t+1;
c=1;
for(i=0;i<n;i++)
   System.out.println("Room no:"+" "+i+"Value:"+" "+a[i]);
System.out.println(""); 
for(i=max;i>=min;i--)
{
for(j=0;j<n;j++)
{
 if(a[j]==i)
  {
  if(c%2!=0)
   {
   if(t>=0)
   {
   t2=a[t];
   a[t]=a[j];
   a[j]=t2;
   t--;
   c++;
   break;
   }
   }
   else
   {
   if(t1<n)
   {
   t2=a[t1];
   a[t1]=a[j];
   a[j]=t2;
   t1++;
   c++;
   break;
   }
   }
      }
  }
   }
   for(i=0;i<n;i++)
   System.out.println("Room no:"+" "+i+"Value:"+" "+a[i]);
   }
   }
   
