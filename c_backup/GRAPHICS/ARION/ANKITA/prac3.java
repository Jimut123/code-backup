
import java.io.*;

class Ex_1
{

	public static void main(String args[])throws IOException
	{
	int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter n(1-20)=");
	n=Integer.parseInt(br.readLine());
	Ex_2 obj=new Ex_2();
	System.out.print(obj.SUM(n));
	}

}

class Ex_2{

	public static int SUM(int n)throws IOException
	{
	int i,s=0,sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	for(i=1;i<=n;i++){
	s=s+i;
	sum=sum+s;
	}
	
	return sum;

	}
	
}
