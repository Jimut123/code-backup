// To copy the content of one file to  another file
import java.io.*;
class file1
{
	public static void main(String args[])throws IOException
	{
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                 String fn2;
                int n=0,ch,i;
		int argc = args.length;
                fn2 = args[argc-1];
                FileOutputStream fp2 = new FileOutputStream(fn2);
                for(i=0;i<argc-1;i++)
                {
                        //ob.args_cp(args[i],args[argc-1]);
                        FileInputStream fp1 = new FileInputStream(args[i]);
                        while((ch=fp1.read())!=-1)      //EOF is -1
                        {
                                fp2.write(ch);
                                n++;
                        }
                        fp1.close();
                        }
                System.out.println("Size of < "+fn2+" >= "+n+" Bytes");
                fp2.close();
	}
}