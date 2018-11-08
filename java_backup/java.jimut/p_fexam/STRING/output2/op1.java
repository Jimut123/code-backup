package STRING.output2;


import java.io.*;
class op1
{
public static void main(String[]args)
{
int x=8,y=12,z=34,p=23,t,t1;
t=++x%2 + (z++ + ++z - ++x)%3 + (++p%3 + --z%2)%4;
t1=(p++%3 + --z%2) + (y++ - ++y%3)%4;
System.out.println("T="+t);
System.out.println("T1="+t1);
}
}