import java.io.*;
public class filetest
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fout=new FileOutputStream("test.bin");
        DataOutputStream dout=new DataOutputStream(fout);
        int a,roll,per;
        String name;
        for(a=1;a<=3;a++)
        {
            System.out.println("Enter your name");
            name=br.readLine();
            System.out.println("Enter your roll");
            roll=Integer.parseInt(br.readLine());
            System.out.println("Enter your percentage");
            per=Integer.parseInt(br.readLine());
            dout.writeUTF(name);
            dout.writeInt(roll);
            dout.writeInt(per);
        }
       dout.close();
       fout.close();
    }
}
            