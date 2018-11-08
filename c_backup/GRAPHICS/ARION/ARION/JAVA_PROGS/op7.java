import java.io.;
class REMCOM
{
	public static void main(String args[])throws IOException
	{
  	String s1,s2;
	char q1='
	int ch,ch2;
	int i=0,j;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println(Enter input file name:);
	s1=br.readLine();
	System.out.println(Enter output file name:);
        s2=br.readLine();
	RandomAccessFile  fp1=new RandomAccessFile(s1,r);
	FileOutputStream fp2=new FileOutputStream(s2);
 

		while((ch=fp1.read())!=-1)
                {
			i++;
			j=i;
			if(ch==42||(char)ch==''||ch==47)
			{	
			if((char)ch=='')
			{
				fp1.seek(++j);
				ch2=fp1.read();
				if(ch2==47)
				{
					fp1.seek(--i);
					while((ch2=fp1.read())!=(int)q1)
						fp2.write(ch);
					ch2=fp1.read()
				}
				}
			else 
			{
				fp1.seek(i);
				fp2.write(ch);
			}
			fp1.seek(i);
			j=i;
			if(ch==47)
			{
				fp1.seek(j);
				if((ch2=fp1.read())==47)
					while((ch2=fp1.read())!=10);
						
			}
			 else
                        {
				 fp1.seek(i);

                                fp2.write(ch);
                        }

			fp1.seek(i);
			j=i;
							
			if(ch==')
                        {
                                fp1.seek(++j);
                                ch2=fp1.read();
                                if(ch2==47)
					if((ch2=fp1.read())!=42)
                                        while((ch2=fp1.read())!=(int)q1)                
                                                fp2.write(ch2);
                        }
			 else
                        {
					 fp1.seek(i);

                                fp2.write(ch);
                        }

                        fp1.seek(i);
                        j=i;
                        if(ch=='')                 
                        {
                                fp1.seek(j);
                                if((ch2=fp1.read())==42)
                                        while((ch2=fp1.read())!='');
                                                fp2.write(32);
                        }
			}
			 else
                        {
				fp1.seek(i);

                                fp2.write(ch);
                        }

			fp1.seek(i);

                }

	
		fp1.close();
	
		fp2.close();
		System.out.println("Size of output file  Bytes.");
	}
}
