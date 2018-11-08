import java.io.*;
class EXWORD
{
	public static void main(String args[])throws IOException
	{
  	String s1,s2;
	char w='\n';
	int ch;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("\nEnter input file name:");
	s1=br.readLine();
	 System.out.println("\nEnter output file name:");
        s2=br.readLine();
	RandomAccessFile  fp1=new RandomAccessFile(s1,"r");
	FileOutputStream fp2=new FileOutputStream(s2);
 

		while((ch=fp1.read())!=-1)
                {
			
			
			
				if((ch>=97&&ch<=122)||(ch>=65&&ch<=90))
				{
				fp2.write(ch);
				System.out.print((char)ch);
				continue;
				}
			
				else{	
					fp2.write((int)w);
					System.out.print("\n");
					
                        	  }
			
                }

	
		fp1.close();
	
		fp2.close();
		//System.out.println("\nSize of output file"+n+"  Bytes.");
	}
}
