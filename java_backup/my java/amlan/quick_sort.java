
import java.io.*;
class quick_sort
{
int i,j,low,high,n,pivot,t,t1;
int a[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter nos of terms:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.println("Give elements:");
a[i]=Integer.parseInt(br.readLine());
}
//t=0;
//t1=n-1;
qsort(0,n-1);
disp();
}
void qsort(int first,int last)
{
int temp;
low=first;
high=last;
pivot=a[(low+high)/2];
do
{
while(a[low]<pivot)
low++;
while(a[high]>pivot)
high--;
if(low<=high)
{
temp=a[low];
a[low]=a[high];
a[high]=temp;
low++;
high--;
}
}while(low<=high);
if(first<high)
qsort(first,high);
if(low<last)
qsort(low,last);
}
void disp()
{
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
}