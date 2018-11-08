import java.io.*;
class number
{

private int ar[]={28,145,6,3,54,19,98,52,124,79,55,98,20,30,188};

public class check
{
int i,j,k;
int a[]=new int[100];
int b[]=new int[100];
int c[]=new int[100];
void krishna()
{
int t=1;
k=0;
int num1;
while(t<15)
{
  i=0;
  j=0;
  num1=ar[t];
  while(num1>0)
  {
  i=num1%10;
  int f=1;
  for(int m=1;m<=i;m++)
    f=f*m;

 j=j+f;
 num1=num1/10;
 }


 if(j==ar[t])
   a[k++]=j;
 t=t+2;
}
System.out.println("Krishnamurthy");
for(int u=0;u<k;u++)
System.out.println(a[u]);
}
void prime()
{
int t=2;
k=0;
int num1;
while(t<15)
{
  i=0;
  j=0;
  num1=ar[t];
  
  int f=0;
  for(int m=1;m<num1;m++)

   if(num1%m==0)
    f=f+m;

 if(f==num1)
  b[k++]=num1;

  t=t+2;
}
System.out.println("Perfect");
for(int u=0;u<k;u++)
System.out.println(b[u]);

}             
void perfect()
{
int t=0;
k=0;
int num1;
while(t<15)
{
  i=0;
  j=0;
  num1=t;

  int f=0;
  for(int m=2;m<num1;m++)
   if(num1%m==0)
    {
    f=1;
    break;
    }

 if(f==0)
  {
  int f1=0;
  for(int m1=2;m1<ar[t];m1++)
   if(ar[t]%m1==0)
    {
    f1=1;
    break;
    }

 if(f1==0)
  {

  c[k++]=ar[t];
  }

 }
  t=t+1;

}
System.out.println("Prime");
for(int u=0;u<k;u++)
System.out.println(c[u]);

}
}
check c=new check();

}

class number1
{
public static void main(String args[])
{
number n=new number();
n.c.krishna();
n.c.perfect();
n.c.prime();
}
}
