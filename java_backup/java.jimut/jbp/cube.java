import java.io.*;
class cube
{
int cb(int n)
{
int c;
c = n*n*n;
return(c)  
}
public static void main (String args[])throws IOException
{
cube ob = new cube();
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,b;
for(i=1;i<=10;i++)
{
System.out.println("ENTER ANY NO.::");
b = Integer.parseInt(cd.readLine());
ob.cb(b);
}
}
}