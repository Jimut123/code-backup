import java.io.*;
public class readtest
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fin=new FileInputStream("test.bin");
        DataInputStream din=new DataInputStream(fin);
        
        boolean eof=false;
        while(eof==false)
        {  
            try
            {
            System.out.println(din.readUTF());
            System.out.println(din.readInt());
            System.out.println(din.readInt());
        }
        catch(EOFException e)
        {
            eof=true;
        }
       }
       din.close();
       fin.close();
    }
}
    
        
    