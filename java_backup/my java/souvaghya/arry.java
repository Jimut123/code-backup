import java.util.*;
class arry
{
void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int i;
System.out.println("Enter 10 elements");
for(i=0;i<10;i++)
a[i]=sc.nextInt();
int s=0;
for(i=0;i<10;i++)
s=s+a[i];
System.out.print(s);
}
}
