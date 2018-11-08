import java.io.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class word_extractor
{
	public static void main(String args[])throws IOException
	{
		// 65 to 90 - A to Z
		// 97 to 122 - a to z
		/**
		File file = new File("test1.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("This is ");
			fileWriter.write("a test");
			fileWriter.flush();
			fileWriter.close();
		**/
		String file1,file2,str;
		int n,ch,ch2;
		long l,l1=0,now=0,nol=0,noc=0,noA=0;
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\nEnter the Input file name :");
        file1 = cd.readLine();
        System.out.println("\nEnter the output file name :");
        file2 = cd.readLine();
        RandomAccessFile fp1 = new RandomAccessFile (file1,"r");
        File file = new File(file2);
        FileWriter fileWriter = new FileWriter(file);
        l=fp1.length();	//length
        n=0;
        while(l1<l)
        {
        	str="";
        	fp1.seek(l1);
        	ch = (char)fp1.read();
        	noc++;
        	//System.out.print(ch+" ");
        	if((ch>=65 && ch<=90) || (ch>= 97 && ch<=122))
        	{
        		noA++;		// the civilian characters 
        		str+=(char)ch;
        		fp1.seek(++l1);
        		ch2 = (char)fp1.read();
        		noc++;
        		while((ch2>=65 && ch2<=90) || (ch2>= 97 && ch2<=122))
        		{
        			noA++;
        			str+=(char)ch2;
        			fp1.seek(++l1);
        			ch2 = (char)fp1.read();
        			if((char)ch2=='\n')
        				nol++;
        			noc++;
        		}
        		now++;
        		System.out.print(str+"\n");
        		fileWriter.write(str+"\n");
        	}
        	else if(ch==10)
        	{
        		nol++;
        	}
        	else
        	{
        		l1++;
        	}
        	
        	l1++;
        }
        System.out.println("No. of Words : "+now);
        fileWriter.write("No. of Words : "+now+"\n");

        System.out.println("No. of Lines : "+nol);
        fileWriter.write("No. of Lines : "+nol+"\n");
        System.out.println("No. of Characters : "+(l-1));
        fileWriter.write("No. of Characters : "+(l-1)+"\n");
        System.out.println("No. of civil Characters : "+noA);
        fileWriter.write("No. of civil Characters : "+noA+"\n");
        System.out.println("No. of special Characters : "+(l-noA));
        fileWriter.write("No. of special Characters : "+(l-noA)+"\n");
        fp1.close();
        fileWriter.flush();
		fileWriter.close();
    }
}