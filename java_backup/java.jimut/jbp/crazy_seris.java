import java.util.*;
 class crazy_seris
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no.");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int i=0;i<n-1;i++)
{
for(int j=i+1;j<n;j++)
{
System.out.print("1");
a[i]=a[i]+1;
}
b[i]=n-a[i];
System.out.println(b[i]);
}

for(int k=1;k<n-1;k++)
{
System.out.print(b[k]);
System.out.println(a[k]);
}
System.out.println(n);
}
}