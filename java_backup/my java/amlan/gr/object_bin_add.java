package gr;

import java.io.*;
class object_bin_add
{
int pos,n,i,s,t;
int a[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
object_bin_add()
{
    n=0;
    pos=0;
}
void accept()throws IOException
{
    System.out.println("Enter data :");
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter binary values in reverse order:");
    for(i=0;i<n;i++)
     a[i]=Integer.parseInt(br.readLine());
    
}
object_bin_add addition(object_bin_add a1,object_bin_add b1)
{
    object_bin_add c1;
    c1=new object_bin_add(); 
     s=0;
t=0;
for(i=a1.n-1;i>=0;i--)
{
if(a1.a[i]==0 && b1.a[i]==0 && pos==0)
{
s=0;
pos=0;
c1.a[t++]=s;
}
else
if(a1.a[i]==0 && b1.a[i]==0 && pos==1)
{
s=1;
pos=0;
c1.a[t++]=s;
}
else
if(a1.a[i]==1 && b1.a[i]==0 && pos==1)
{
s=0;
pos=1;
c1.a[t++]=s;
}
else
if(a1.a[i]==1 && b1.a[i]==0 && pos==0)
{
s=1;
pos=0;
c1.a[t++]=s;
}
else
if(a1.a[i]==0 && b1.a[i]==1 && pos==0)
{
s=1;
pos=0;
c1.a[t++]=s;
}
else
if(a1.a[i]==0 && b1.a[i]==1 && pos==1)
{
s=0;
pos=1;
c1.a[t++]=s;
}
else
if(a1.a[i]==0 && b1.a[i]==1 && pos==0)
{
s=1;
pos=0;
c1.a[t++]=s;
}
else
if(a1.a[i]==1 && b1.a[i]==1 && pos==1)
{
s=1;
pos=1;
c1.a[t++]=s;
}
else
if(a1.a[i]==1 && b1.a[i]==1 && pos==0)
{
s=0;
pos=1;
c1.a[t++]=s;
}
} 
c1.a[t]=pos;
for(i=t;i>=0;i--)
System.out.print(c1.a[i]);

c1.n=t; 
//System.out.println(c1.n);
return c1;
}
void disp()
{
    for(i=n-1;i>=0;i--)
     System.out.print(a[i]);
    }
    public static void main(String args[])throws IOException
    {
        object_bin_add o=new object_bin_add();
         object_bin_add o1=new object_bin_add();
         o.accept();
         System.out.println("Second Number");
         o1.accept();
         o.disp();
         System.out.println("");
         o1.disp();
         System.out.println("");
         object_bin_add o2;
         o2=o.addition(o,o1);
         System.out.println("");
         //o2.disp();
        }
    }
  