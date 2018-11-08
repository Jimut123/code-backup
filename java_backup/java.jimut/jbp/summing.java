import java .io.*;
public class summing
{
public static void main ( String name , int n) 
{
int k,s=0;
while (n > 0)
{
k = n % 10;
s = s +  k;
n = n / 10;
}
System.out.println(+s);

}
}
