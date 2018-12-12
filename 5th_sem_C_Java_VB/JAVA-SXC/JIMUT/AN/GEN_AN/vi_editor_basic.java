import java.io.*;
import java.lang.*;
class vi_editor_basic
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
		long n,i;
		char ch;
		int num,j;
		//RandomAccessFile fp1 = new RandomAccessFile (args[0],"r");
		//n=fp1.length();		// size of the input file
		for(j=0;j<args.length;j++)
		{
			RandomAccessFile fp1 = new RandomAccessFile (args[j],"r");
			for(i=0;i<fp1.length();i++)
			{
				fp1.seek(i);
				ch = (char)fp1.read();
				System.out.print(ch);
				if(i%200==0)
				{
					System.out.println("\n------------------------------------------------------------------------------------------------- Name : "+args[j]);
					System.out.println("\nEnter | 1 for more else exit\n");
					num = Integer.parseInt(cd.readLine());
					if(num==1)
						continue;
					else
						break;
				}
			}
			fp1.close();
		}
		
	}
}
