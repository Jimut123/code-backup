import java.io.*;
class lcm_ar
{
public static void main(String args[])throws IOException
{

InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,k,n;
int min=0;
int f,j;
System.out.println("Enter array length:");
n=Integer.parseInt(input.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in array");
for(i=0;i<n;i++)
{

a[i]=Integer.parseInt(input.readLine());
}

min=a[0];
for(i=0;i<n;i++)
if(a[i]<min)
min=a[i];
i=1;
while(true)
{
k=min*i;
f=0;
for(j=0;j<n;j++)
if((k%a[j])==0)
{
f=1;
}
else
{
f=0;
break;
}
if(f==1)
break;
i++;
}
System.out.print("LCM" +" " +k);
}
}
