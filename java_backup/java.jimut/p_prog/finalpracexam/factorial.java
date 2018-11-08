package finalpracexam;


import java.io.*;
class factorial
{
public static void main(String[]args)
{
int i=1,f=1;
do
{
f=f*i;
i++;
}
while(i<=10);
System.out.println("The factorial of 10="+f);
}
}