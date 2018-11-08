

import java.io.*;

class Ex_1
{
	public static void main(String args[])throws IOException
	{
	int a ,b,c,s,avg,big;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter a=");
	a=Integer.parseInt(br.readLine());
	System.out.print("\nEnter b=");
	b=Integer.parseInt(br.readLine());
	System.out.print("\nEnter c=");
	c=Integer.parseInt(br.readLine());

	s=a+b+c;
	avg=s/3;
	big=a;

		if(big<b)
		big=b;
		if(big<c)
		big=c;
System.out.print("a="+a+" b="+b+" c="+c+" sum="+s+" avg="+avg+" big="+big);
	}
}
	