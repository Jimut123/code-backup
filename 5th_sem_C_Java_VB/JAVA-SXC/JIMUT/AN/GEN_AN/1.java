import java.io.*;
class Ex1
{
	public static void main(String args[])throws IOException{
		
			InputStreamReader ab = new InputStreamReader(System.in);
			BufferedReader cd = new BufferedReader(ab);
			int a,b,c,sum=0,l;
			float avg;
			System.out.println("Enter 3 nos :");
			a = Integer.parseInt(cd.readLine());
			b = Integer.parseInt(cd.readLine());
			c = Integer.parseInt(cd.readLine());
			sum=0;
			sum=a+b+c;
			avg = sum/3;
			System.out.println("Sum = "+sum);
			System.out.println("Avg = "+avg);
			if(a>b)
			{
				l=a;
				if(a>c)
					l=c;
				else
					l=a;
			}
			else
			{
				l=b;
				if(b>c)
					l=b;
				else
					l=c;
			}
			System.out.println("Largest = "+l);
		}
}