import java.io.*;
class FILESPLIT
{
	public static void main(String args[])throws IOException
	{
  	int argc=args.length;
	int i=1,ch;
	long n,n1,n2,k,s;
	//FileOutputStream fp2;
	RandomAccessFile  fp1=new RandomAccessFile(args[0],"r");
	n=fp1.length();
	n1=n/(argc-1);      	//average size of output file
	n2=n-n1*(argc-2);	//size of last op file
	
	while(i<=argc-1)
	{
	    	s=1;	
		FileOutputStream fp2=new FileOutputStream(args[i]); 
		if(i!=argc-1)
			k=n1;
		else k=n2;
		while((ch=fp1.read())!=-1&&(s<=k))
                {
                        fp2.write(ch);
                        ++s;
                }
		++i;

	
		fp2.close();
	
	}
		fp1.close();
		System.out.println("\nSize of output file"+n+"  Bytes.");
	}
}
