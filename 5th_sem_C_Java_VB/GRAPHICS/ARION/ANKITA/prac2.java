

import java.io.*;

class Ex_2
{
	public static void main(String args[])throws IOException
	{
	int c;
	float f;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter c(0-100)=");
	c=Integer.parseInt(br.readLine());

	f=((9*c)/5)+32;
	
	if(c<0 || c>100)
	System.out.print("Invalid data! Tray again!");
	else
	System.out.print("c="+c+" f="+f);
	


	}
}