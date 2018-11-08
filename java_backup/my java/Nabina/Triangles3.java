import java.io.*;
class Triangles3
{
	public static void main(String args[])throws IOException
	{
	int p,s,j,n;
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no.:");
	n=Integer.parseInt(input.readLine());
	p=1;
	s=11;
	while(p<=n)
	{
	System.out.println(p);
	p=p*s;
	}
	}
	}