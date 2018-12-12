import java.io.*;
class file2
{
	public static void main(String args[])throws IOException
	{
		String file1;
		int n,ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter input file name:");
		file1=br.readLine();
		/*System.out.println("\nEnter output file name:");
		file2=br.readLine();*/
		RandomAccessFile fp1=new RandomAccessFile(file1,"rw");
		n=0;
		
		while((ch=fp1.read())!=-1)
		{
			if(ch>=97&&ch<=122)
			{
			fp1.seek(n);
			fp1.write(ch-32);
			//n++;
			}
			n++;	
		}
		fp1.close();
		//System.out.println("\nSize of <"+file2+">= "+n+" Bytes.");
	}
}

