import java.io.*;
class array
{
public static void main(String args[])throws IOException
{
int i,g=1,p=0,e,k=0,n,x;
int a[]=new int[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter "+n+" no.s :");
g=1;
for(i=0;i<n;i++)
{
System.out.println("("+g+")");
a[i]=Integer.parseInt(input.readLine());
g++;
}
do
{
System.out.println("Press 1 to insert an element ");
System.out.println("Press 2 to delete an element ");
System.out.println("Press 3 to exit ");
x=Integer.parseInt(input.readLine());
switch(x)
{
case 1: System.out.println("Enter position for inserting the element:");
        p=Integer.parseInt(input.readLine());
        System.out.println("Enter element:");
        e=Integer.parseInt(input.readLine());
        k=n-1;
        while(k>=p)
        {
        a[k+1]=a[k];
        k--;
        }
        a[p]=e;
        n=n+1;
        break;
        
case 2: System.out.println("Enter element:");
        e=Integer.parseInt(input.readLine());
        k=n-1;
        for(i=0;i<n;i++)
        {
        if(e==a[i])
        {
        p=i;
        break;
        }
        }
        k=p+1;
        while(k<n)
        {
        a[k-1]=a[k];
        k++;
        }
        n=n-1;
        break;
        
case 3:System.exit(0);
       break;

default: System.out.println("Press 1/2/3 :");
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println(" ");
}while(true);
}
}       