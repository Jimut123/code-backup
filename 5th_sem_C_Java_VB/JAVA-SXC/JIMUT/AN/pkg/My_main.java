import java.io.*;
import sd_package.*;
public class My_main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a");
		int a=Integer.parseInt(br.readLine());
		System.out.print("Enter b");
		int b=Integer.parseInt(br.readLine());
		calculate obj=new calculate();
		System.out.print("SUM: " + obj.sum(a,b));
	    System.out.print("\nPROD: " + obj.prod(a,b));
	    System.out.print("\nAVG: " + obj.average(a,b));
		
			
	}

}