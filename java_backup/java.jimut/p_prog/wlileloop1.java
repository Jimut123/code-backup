import java.io.*;
class wlileloop1
{
public static void main(String[]args)
{
int i=1,j=1,c=0;
while(i<=100)
{
c=0;
while(j<=i)
{
c++;
j++;
}
if(c==2)
{
System.out.println(i);
i++;
}
}
}
}