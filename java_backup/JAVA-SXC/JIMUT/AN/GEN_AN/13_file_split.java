import java.io.*;

class file_split
{
	public static void main(String args[])throws IOException
	{
                //java file_split ka1.txt ka1_1.txt ka1_2.txt
				InputStreamReader ab = new InputStreamReader(System.in);
       			BufferedReader cd = new BufferedReader(ab);
        		String fn2;
				int argc = args.length; // the total no. of arguments passed
                int no_of_files_gen = argc-1;
                fn2 = args[0];
                RandomAccessFile fp1 = new RandomAccessFile (fn2,"r");
				long n = fp1.length();  //To get the length of a file
                System.out.println("Size of the file :"+n);
                long each_file_size = n/no_of_files_gen;
                System.out.println("Size of each splitted file :"+each_file_size);
                FileInputStream fp1_1 = new FileInputStream(args[0]);
                char ch;
                int i,size_fp;  // = each_file_size;
                for(i=1;i<argc;i++)
                {
                    size_fp=0;
                    FileOutputStream fp2 = new FileOutputStream(args[i]);
                    while(size_fp<=each_file_size)
                    {
                        ch=(char)fp1_1.read();
                        fp2.write(ch);
                        size_fp++;
                    }
                    
                    System.out.println("Size of < "+args[i]+" >= "+size_fp+" Bytes");
                    fp2.close();
                }
                fp1.close();
    }
}