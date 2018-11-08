import java.io.*;
import java.lang.*;
class AsciiBitVal
{
	long rev(long n)
	{
		int d;
		long s=0;
		while(n!=0)
		{
			d=(int)n%10;
			s=s*10+d;
			n=n/10;
		}
		return s;
	}
	public static void main(String args[])throws IOException
	{
		long n,i,p;
		int as,k;
		char lp;
		char ch;
		AsciiBitVal ob = new AsciiBitVal();
		RandomAccessFile fp1 = new RandomAccessFile (args[0],"r");
		FileOutputStream fp2 = new FileOutputStream(args[1]);
		n=fp1.length();		// size of the input file
		for(i=0;i<n;i++)
		{
			fp1.seek(i);
			ch = (char)fp1.read();
			as = (int)ch;
			fp2.write('[');
			fp2.write(' ');
			fp2.write(ch);
			//System.out.print(ch);
			fp2.write(',');
			fp2.write(' ');
			p=ob.rev(i);
			while(p!=0)
			{
				lp = (char)p%10;
				//System.out.print(lp);
				fp2.write(lp);
				p=p/10;
			}
			fp2.write(',');
			fp2.write(' ');
			p=ob.rev(as);
			while(p!=0)
			{
				lp = (char)p%10;
				//System.out.print(lp);
				fp2.write(lp);
				p=p/10;
			}
			fp2.write(' ');
			fp2.write(']');
		}
		fp1.close();
		fp2.close();
	}
}