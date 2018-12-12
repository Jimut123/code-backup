import java.io.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class cmt_remvr
{
	public static void main(String args[])throws IOException
	{

		String file1, file2;
		long  l,i,n;
		char ch,ch1;

		InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                System.out.println("\nEnter the Input file name :");
                file1 = cd.readLine();
                System.out.println("\nEnter the output file name :");
                file2 = cd.readLine();
                RandomAccessFile fp1 = new RandomAccessFile (file1,"r");
                l=fp1.length();

                File file = new File(file2);
                FileWriter fileWriter = new FileWriter(file);

                for(i=0;i<l;i++)
                {
                	fp1.seek(i);
                	ch=(char)fp1.read();
                	//System.out.print("ch = "+ch+" i = "+i);
                	
                	if(ch=='/')
                	{
                		fp1.seek(++i);
                		ch1=(char)fp1.read();
                		if(ch1=='/')
                		{
                			while(ch!='\n')
                			{
                				fp1.seek(++i);
                				ch=(char)fp1.read();
                			}
                			i--;
                		}
                		if(ch1=='*')
                		{
                                        fp1.seek(++i);
                                        ch=(char)fp1.read();
                			while(ch!='/')
                			{
                				fp1.seek(++i);
                				ch=(char)fp1.read();
                			}
                			i--;
                		}
                	}
                	else if(ch=='"')
                	{
                                fileWriter.write(ch);
                		fp1.seek(++i);
                		ch1=(char)fp1.read();
                		fileWriter.write(ch1);
                		if(ch1=='"')
                		{
                			fp1.seek(++i);
                			ch=(char)fp1.read();
                			//System.out.print(ch+ch1);
                			fileWriter.write(ch+ch1);
                			while(ch!='"')
                			{
                				fp1.seek(++i);
                				ch=(char)fp1.read();
                				//System.out.print(ch);
                				fileWriter.write(ch);
                			}
                                        fp1.seek(i);
                                        ch=(char)fp1.read();
                                        fileWriter.write(ch);
                			--i;
                		}

                	}
                	else
                	{
                		//System.out.print(ch);
                		fileWriter.write(ch);
                	}
                	
                }
                fp1.close();
                fileWriter.flush();
        		fileWriter.close();
        		System.out.println("\n");
        		FileInputStream fp4 = new FileInputStream(file2);
                n=0;
                int ch2;
                while((ch2=fp4.read())!=-1)	//EOF is -1
                {
                	System.out.print((char)ch2);
                }
                fp1.close();
	}
}