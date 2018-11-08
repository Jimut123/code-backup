
import java.io.*;

class Ex_1
{

	public static void main(String args[])throws IOException
	{
	int a,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter a=");
	a=Integer.parseInt(br.readLine());
	System.out.print("\nEnter b=");
	b=Integer.parseInt(br.readLine());
	Ex_2 obj=new Ex_2();
	System.out.print("\nLCM\n");
	System.out.print(obj.LCM(a,b));
	System.out.print("\nHCF\n");
	System.out.print(obj.HCF(a,b));
	}

}

class Ex_2{

	public static int HCF(int a,int b)throws IOException
	{
	int r;			
		while((r=a%b)!=0)
		{
		a=b;
		b=r;
		}
		
	return b;

	}

public static int LCM(int a,int b)throws IOException
	{
	
	int h,lc;
	h=HCF(a,b);
	lc=a*b/h;
	return lc;
	}
}
