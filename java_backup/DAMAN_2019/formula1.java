import java.io.* ;
class formula1
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader (ab);
		System.out.println("Enter 5 numbers:");
		int a,b,c,d,e,f;
		a = Integer.parseInt(cd.readLine());
		b = Integer.parseInt(cd.readLine());
		c = Integer.parseInt(cd.readLine());
		d = Integer.parseInt(cd.readLine());
		e = Integer.parseInt(cd.readLine());
		f = ((((a+b)* c)/d)%e);
		System.out.println("sum = "+f);
	}
}

