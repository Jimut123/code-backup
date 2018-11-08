package file_operation;
import java.io.*;
class bin_op
{
    int lang1,lang2,roll;
    String name="";
    void write()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("D://data.bin");
        DataOutputStream dout=new DataOutputStream(fout);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter yout name ");
            dout.writeUTF(in.readLine());
            System.out.print("Enter your roll ");
            dout.writeInt(Integer.parseInt(in.readLine()));
            System.out.print("Enter your marks in 1st lang ");
            dout.writeInt(Integer.parseInt(in.readLine()));
            System.out.print("Enter your marks in 2nd lang ");
            dout.writeInt(Integer.parseInt(in.readLine()));
        }
    }
    void read()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileInputStream fin=new FileInputStream("d://data.bin");
        DataInputStream din=new DataInputStream(fin);
        System.out.println("Name\t\tRoll\t\tLang1\t\tLang2\t\t");
        boolean eof=false;
        while(!eof)
        {
            try
            {
                name=din.readUTF();
                System.out.print(name+"\t\t");
                roll=din.readInt();
                System.out.print(roll+"\t\t");
                lang1=din.readInt();
                System.out.print(lang1+"\t\t");
                lang2=din.readInt();
                System.out.print(lang2+"\t\t");
                System.out.println();
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }
    }
    void main()throws IOException
    {
        bin_op bin=new bin_op();
        bin.write();
        bin.read();
    }
}