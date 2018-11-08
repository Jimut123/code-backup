import java.io.*;
class series_2
{
public static void main (String args [])
{
int i;
for (i=1;i<=100;i=i+1)
{
i=(i^2)-1;
System.out.print (i+",");
}
}
}