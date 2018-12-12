import java.io.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class cmt_remvr
{
	public static void main(String args[])throws IOException
	{
		String file1,file2,str="";
		int n;
		char ch1,ch2;
		long l,i;
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
        	ch1 = (char)fp1.read();
        	if(ch1=='"')
        	{	
        		str+=ch1;
        		i++;
        		fp1.seek(i);
	        	ch1 = (char)fp1.read();
        		while(ch1!='"')
        		{
        			i++;
        			fp1.seek(i);
	        		ch1 = (char)fp1.read();
	        		str+=ch1;
	        		System.out.println("**"+ch1);
        		}
        		str+=ch1;
        	}
        	if(ch1=='/')
        	{
	        	fp1.seek(i+1);
	        	ch2 = (char)fp1.read();
	        	if(ch2=='/')
	        	{
	        		while(ch2!='\n')
	        		{
	        			fp1.seek(++i);
	        			ch2 = (char)fp1.read();
	        		}
	        	}
	        	if(ch2=='*')
	        	{
	        		while(ch2!='/')
	        		{
	        			fp1.seek(++i);
	        			ch2 = (char)fp1.read();
	        		}
	        	}
	        }
	        if(ch1!='"'&&ch1!='/') 
	        {
	        	str+=ch1;
	        }

        }
        System.out.println(str);
	}
}