import java.io.*;
class factorial
{
public static void main (String args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int n,i,j;
double f=1;
System.out.println("ENTER THE VALUE WHICH YOU WANT TO MAKE FACTORIAL OF : ");
n = Integer.parseInt(cd.readLine());
{
for(i=1;i<=n;i++)
{
f = f * i;
}
System.out.println("FACTORIAL : "+f);
}
}
}