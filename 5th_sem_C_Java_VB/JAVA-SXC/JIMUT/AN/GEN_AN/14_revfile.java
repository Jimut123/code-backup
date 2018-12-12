import java.io.*;
class rev_file
{
	public static void main(String args[])throws IOException
	{
		long n,i;
		char ch;
		RandomAccessFile fp1 = new RandomAccessFile (args[0],"r");
		n=fp1.length();		// size of the input file
		FileOutputStream fp2 = new FileOutputStream(args[1]);
		fp1.seek(n);
		for(i=n-1;i>=0;--i)
		{
			fp1.seek(i);
			ch=(char)fp1.read();
			fp2.write(ch);
		}
		fp2.close();
		fp1.close();
	}
}