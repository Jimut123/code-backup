import java.io.*;
class FILEDISP
{
	public static void main(String args[])throws IOException
	{
  	int argc=args.length;
	int i=0,ch,s=0,n=0;
	//	char ch;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//FileOutputStream fp2;
	//RandomAccessFile  fp1=new RandomAccessFile(args[0],"r");
	//n=fp1.length();
	
	while(i<=argc-1)
	{
	    	s=0;	
		RandomAccessFile fp2=new RandomAccessFile(args[i],"r");
		System.out.println("NOW DISPLAYING FILE :"+args[i]+"  :  "); 
		while((ch=fp2.read())!=-1)
                {
			if(s<=150)
                        {
				System.out.print((char)ch);
                        }
			else
			{
				System.out.println("\n\nPress any key to next page:");
				br.readLine();
				s=0;
			}
		s++;	
		n++;
                }
		++i;

	
		fp2.close();
	
	}
		//fp1.close();
		System.out.println("\nSize of output file"+n+"  Bytes.");
	}
}
