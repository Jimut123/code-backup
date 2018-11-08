import java.io.*;
class Collection
{
int arr[]=new int[100];
int len,i,k,v,j;
Collection()
{
//System.out.println("l"+len);
len=100;
}
Collection(int size)
{
int arr[]=new int[size];
len=size;
//System.out.println(len);
}

void inputarr()throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter "+len+" no.s into array");
for(i=0;i<len;i++)
{
System.out.println("Enter element"+(i+1));
arr[i]=Integer.parseInt(input.readLine());
}
sort();
display();
k=len;
}

Collection common(Collection c2)
{
k=0;
Collection c3=new Collection(len+c2.len);
for(i=0;i<len;i++)
{
v=arr[i];
for(j=0;j<c2.arr.length;j++)
{
if(v==c2.arr[j])
{
c3.arr[k++]=v;
System.out.println(c3.arr[k]);
}
}
}
return c3;
}
void sort()
{
for(i=0;i<k-1;i++)
for(j=i+1;j<k;j++)
if(arr[i]>arr[j])
{
v=arr[i];
arr[i]=arr[j];
arr[j]=v;
}
}
void display()
{
System.out.println("Your new array:");
for(i=0;i<len;i++)
{
System.out.println(arr[i]);
}
}
}
