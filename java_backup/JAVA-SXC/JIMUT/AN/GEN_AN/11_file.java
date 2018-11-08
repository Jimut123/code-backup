// To copy the content of one file to  another file
import java.io.*;
class file1
{
	public static void main(String args[])throws IOException
	{
		String file1,file2;
		int n,ch;
		InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\nEnter the Input file name :");
        file1 = cd.readLine();
        System.out.println("\nEnter the output file name :");
        file2 = cd.readLine();
        FileInputStream fp1 = new FileInputStream(file1);
        FileOutputStream fp2 = new FileOutputStream(file2);
        n=0;
        while((ch=fp1.read())!=-1)	//EOF is -1
        {
        	fp2.write(ch);
        	n++;
        }
        fp1.close();
        fp2.close();
        System.out.println("Size of < "+file2+" >= "+n+" Bytes");
	}
}