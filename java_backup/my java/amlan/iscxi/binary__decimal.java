package iscxi;

import java.io.*;
class binary__decimal
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,c,p=0,f=0;String s;
System.out.print("Enter the number");
s=br.readLine();
String w,w1;
w=w1="";
for(i=0;i<s.length();i++)
{
    if(s.charAt(i)=='.')
    { p=i;
        f=1;
        break;
    }
    else
    { w=w+s.charAt(i);
    }
    
}
//System.out.println(w);
double x,x1;
x=x1=0;
c=0;
for(i=w.length()-1;i>=0;i--)
{ 
  if(w.charAt(i)=='1')
  {
      x=x+1*Math.pow(2,c);
    }
    c++;
}
if(f==1)
{
for(i=p+1;i<s.length();i++)
    w1=w1+s.charAt(i);
c=-1;
for(i=0;i<w1.length();i++)
{
    if(w1.charAt(i)=='1')
    {
        x1=x1+1*Math.pow(2,c);
    }
    c=c+(-1);
}
}
x=x+x1;
System.out.print(x);
}
}

        