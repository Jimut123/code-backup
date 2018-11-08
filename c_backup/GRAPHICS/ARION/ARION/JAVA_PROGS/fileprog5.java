import java.io.*;
class TEXTCOPY
{
	public static void main(String args[])throws IOException
	{
  	int argc=args.length;
	int i=0,ch,s,n=0;
	//FileOutputStream fp2;
	//RandomAccessFile  fp1=new RandomAccessFile(args[0],"r");
	FileOutputStream fp2=new FileOutputStream(args[argc-1]);

	while(i<argc-1)
	{
	    	s=0;	
		RandomAccessFile  fp1=new RandomAccessFile(args[i],"r");

		//FileOutputStream fp2=new FileOutputStream(args[n-1]); 

		while((ch=fp1.read())!=-1)
                {
			if(ch>=32&&ch<=122)
                        	fp2.write(ch);
                        
			++s;
			++n;
                }
		++i;

	
		fp1.close();
	
	}
		fp2.close();
		System.out.println("\nSize of output file"+n+"  Bytes.");
	}
}
