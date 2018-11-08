// To calculate the file sizes of the files inputed as arguments in java
import java.io.*;
class file_size
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int len,i;
        long count_size;
        String file_name;
        len = args.length;
        System.out.println("[+] Total no. of files passed as param : "+len);
        for(i=0;i<len;i++)
        {
            count_size=0;
            file_name = args[i];
            RandomAccessFile fp = new RandomAccessFile(file_name,"rw");
            System.out.println("[o] Name : "+file_name);
            while(fp.read()!=-1)
            {
                fp.seek(count_size);
                System.out.print((char)fp.read());
                count_size++;
                if(count_size%50==0)
                    System.out.println();
            }
            System.out.println("["+(i+1)+"] Total no. of characters present : "+count_size);
            fp.close();
        }
        
    }
}
