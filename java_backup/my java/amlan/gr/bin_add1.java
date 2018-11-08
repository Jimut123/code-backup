package gr;
import java.io.*;
class bin_add1
{
  
String s;
int i,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
bin_add1()
{
   s="";
   c=0;
}
void input()throws IOException
{
System.out.println("Enter Binary Number:");
s=br.readLine();
}
void disp()
{
    System.out.println("The number is :"+s);
}
bin_add1 add(bin_add1 x,bin_add1 y)
{
    bin_add1 z=new bin_add1();
    z.s="";
    z.c=0;
    //x.disp();
//y.disp();
    
if(x.s.length()>y.s.length())
{
    while(y.s.length()<x.s.length())
    {
        y.s="0"+y.s;
    }
}
else
if(y.s.length()>x.s.length())
{
    while(x.s.length()<y.s.length())
    {
        x.s="0"+x.s;
    }
}

for(i=x.s.length()-1;i>=0;i--)
{
if(x.s.charAt(i)=='0' && y.s.charAt(i)=='0' && z.c==0)
{
z.s="0"+z.s;
z.c=0;
}
else
if(x.s.charAt(i)=='0' && y.s.charAt(i)=='0' && z.c==1)
{
//System.out.println("dd"+z.c);
    z.s="1"+z.s;
z.c=0;
}
else
if(x.s.charAt(i)=='1' && y.s.charAt(i)=='0' && z.c==1)
{
z.s="0"+z.s;
z.c=1;
  
}
else
if(x.s.charAt(i)=='1' && y.s.charAt(i)=='0' && z.c==0)
{
z.s="1"+z.s;
z.c=0;
}
else
if(x.s.charAt(i)=='0' && y.s.charAt(i)=='1' && z.c==0)
{
z.s="1"+z.s;
z.c=0;
}
else
if(x.s.charAt(i)=='0' && y.s.charAt(i)=='1' && z.c==1)
{
z.s="0"+z.s;
z.c=1;
}
else
if(x.s.charAt(i)=='0' && y.s.charAt(i)=='1' && z.c==0)
{
z.s="1"+z.s;
z.c=0;
}
else
if(x.s.charAt(i)=='1' && y.s.charAt(i)=='1' && z.c==1)
{
z.s="1"+z.s;
z.c=1;
}
else
if(x.s.charAt(i)=='1' && y.s.charAt(i)=='1' && z.c==0)
{
z.s="0"+z.s;
z.c=1;
}
}
if(z.c==0)
z.s="0"+z.s;
else
z.s="1"+z.s;
return z;
}
public static void main(String args[])throws IOException
{
    bin_add1 x=new bin_add1();
    
    bin_add1 y=new bin_add1();
    bin_add1 b2=new bin_add1();
    System.out.println("Binary Numbers are:");
     x.input();
   y.input();
    //x.disp();
    //y.disp();
    b2=x.add(x,y);
   
    x.disp();
    y.disp();
    System.out.println("Binary Numbers after addition:");
    b2.disp();
}
}
