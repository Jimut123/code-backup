import java . io.*;
class testt2
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int p,w,k=8,m=11,r=7;
p = (r++%7)+(--m%5)+k*(++k-8);
w = k*(m++/3)+(k+(--r+r++));
System.out.println(p);
System.out.println(w);
}
}
