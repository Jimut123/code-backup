import java.io.*;
import java.lang.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class res_bin
{
	char retDNA(char m1,char m2)
	{
		if(m1=='0'&&m2=='0')
			return 'A';
		if(m1=='0'&&m2=='1')
			return 'T';
		if(m1=='1'&&m2=='0')
			return 'C';
		if(m1=='1'&&m2=='1')
			return 'G';
		return '\n';
	}
	String revBin(String str)
	{
		String rev="";
		int i, l = str.length();
		for(i=l-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
	String decTbin(int ascii)
	{
		String bin="";
		int d;
		while(ascii!=0)
		{
			d=(int)ascii%2;
			bin+=d;
			ascii/=2;
		}
		return '0'+bin;
	}
	public static void main(String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String inpfname,outfname,kret,krev;
        res_bin ob = new res_bin();
        System.out.println("\n Enter the file name to be encrypted ! : ");
	    inpfname = cd.readLine();
	    int ch,ascii,i,len;
	    char m1,m2,dnach;
	    //System.out.println(ob.decTbin(65));
	    
	    FileInputStream fp1 = new FileInputStream(inpfname);
	    System.out.println("\n Enter the Output file name : ");
	    outfname = cd.readLine();
	    File file = new File(outfname);
     	FileWriter fw = new FileWriter(file);
	    while((ch=fp1.read())!=-1)	//EOF is -1
        {
        	ascii=(int)ch;
        	System.out.print(ascii);
        	kret = ob.decTbin(ascii);
        	krev = ob.revBin(kret);	//reversed bin string
        	System.out.print(kret);
        	System.out.print(krev);
        	len = kret.length(); 
        	System.out.print("Lenght : "+len);
        	for(i=0;i<len-2;i+=2)
        	{
        		m1=krev.charAt(i);
        		m2=krev.charAt(i+1);
        		dnach = ob.retDNA(m1,m2);
        		//System.out.print();
        		fw.write(dnach);
        	}
        	
        }
	    System.out.println("\n");
		fw.flush();
		fw.close();
		
	}
	
}