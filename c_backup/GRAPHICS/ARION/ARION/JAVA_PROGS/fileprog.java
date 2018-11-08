import java.io.*;
class file1
{
	public static void main(String args[])throws IOException
	{
		String file1,file2;
		int n,ch,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter input file name:");
		file1=br.readLine();
		System.out.println("\nEnter output file name:");
		file2=br.readLine();
		RandomAccessFile fp1=new RandomAccessFile(file1,"r");
		FileOutputStream fp2=new FileOutputStream(file2);
		n=0;
		
		while((ch=fp1.read())!=-1)
		{
			++n;
		}
		fp1.seek(n-1);
		i=n-1;
		while(i>=0)
		{
			fp1.seek(i);
			ch=fp1.read();
			fp2.write(ch);
			--i;	
		}
		fp1.close();
		fp2.close();
		System.out.println("\nSize of <"+file2+">= "+n+" Bytes.");
	}
}

