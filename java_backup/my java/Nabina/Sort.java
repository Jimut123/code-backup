import java.io.*;
class Sort
{
int arr[]=new int[50];
int item,i,j,f=0,g=1,p,temp,high,low,mid;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void inpdata()throws IOException
{
System.out.println("Enter 50 elements :");
System.out.println("Please don't enter duplicate elements");
g=0;
for(i=0;i<5;i++)
{
System.out.println("("+g+")");
arr[i]=Integer.parseInt(input.readLine());
f=0;
for(j=0;j<g;j++)
{
p=arr[j];
if(arr[i]==arr[j])
{
f=1;
break;
}
}
if(f==1)
{
System.out.println("Duplicate element: "+arr[i]);
System.out.println("Enter new:");
arr[i]=Integer.parseInt(input.readLine());
}
g++;
}
bubsort();
}

void bubsort()throws IOException
{

for(i=0;i<5;i++)
{
for(j=0;j<5-i-1;j++)
{
if(arr[j+1]<arr[j])
{
temp=arr[j+1];
arr[j+1]=arr[j];
arr[j]=temp;
}
}

}

System.out.println("Your 50 no.s are:");
for(i=0;i<5;i++)
{
System.out.println(arr[i]+"");
}
binsearch();
}

void binsearch()throws IOException
{
System.out.println("Enter item to be found:");
item=Integer.parseInt(input.readLine());
high=5-1;
low=0;
mid=(high+low)/2;
f=0;
while(low<=high)
{
if(item==arr[mid])
{
f=1;
break;
}
else
if(item>arr[mid])
{
low=mid+1;
}
else
{
high=mid-1;
}
mid=(high+low)/2;
}
if(f==1)
System.out.println("Element-"+item+" found in"+(mid+1)+" position");
else
System.out.println("Element not in the list");
}

}

