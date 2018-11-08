import java.io.*;
import java.lang.*;
class extract_char
{
	public static void main(String args[])throws IOException
	{
		long i,count=0;
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        RandomAccessFile fp1 = new RandomAccessFile (args[0],"r");
        RandomAccessFile fp2 = new RandomAccessFile (args[1],"rw");
        char ch;
        for(i=0;i<fp1.length();i++)
		{
			fp1.seek(i);
			ch = (char)fp1.read();
			if(ch>=32 && ch <= 122)
			{
				count++;
				fp2.write(ch);
				if(count%75==0)
					fp2.write('\n');
			}
		}
		fp1.close();
		fp2.close();
    }
}