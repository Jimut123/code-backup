/*
Write a program in Java to input 3 arbitrary numbers. Calculate amd print 
(i) sum (ii) average (iii) lergest value.
*/

import java.io.*;

class Ex_1
{
	public static void main(String args[])throws IOException
	{
		int a, b, c, s, avg, big;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter a = ");
		a = Integer.parseInt(br.readLine());
		System.out.print("Enter b = ");
		b = Integer.parseInt(br.readLine());
		System.out.print("Enter c = ");
		c = Integer.parseInt(br.readLine());

		s = a + b + c;
		avg = s / 3;
		big = a;
		if(b > big)
			big = b;
		if(c > big)
			big = c;

		System.out.println("a=" + a + "  b=" + b + "  c=" + c);
		System.out.println("Sum=" + s + "  Average=" + avg + "  Largest=" + big);
	}
}