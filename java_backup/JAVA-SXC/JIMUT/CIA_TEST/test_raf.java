// To calculate the file sizes of the files inputed as arguments in java
import java.io.*;
class test_raf
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int len,i,counter=0;
        RandomAccessFile fp = new RandomAccessFile(args[0],"rw");
        // So random acess file doesn't writes anything, if we want to write something then use FileOutputStream
        for(i=0;i<10;i++)
        {
            fp.seek(counter);
            if(i%2==0&&i%3==0)
                fp.write('A');
            counter++;
        }
        fp.close();
    }
}
