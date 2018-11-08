import java.io.*;
class output6
{
public static void main(int x,int y,int z)
{
int t=(++y - ++z)%3 +(--x + ++y)%2;
System.out.println(t);
}
}