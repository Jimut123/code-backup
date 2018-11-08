import java.io.*;
class min
{
public static void main (String args[]) throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int n,i,i1;
System.out.println("ENTER THE VALUE OF THE TERMS : ");
n = Integer.parseInt(cd.readLine());
for(i=1;i<=n;i++)
{
System.out.println("ENTER THE VALUE OF THE NOS. : ");
i1 = Integer.parseInt(cd.readLine());
}
i1 = i;
if (i1>=i)
System.out.println("THE GREATEST  NO. : "+i1);
}
}
