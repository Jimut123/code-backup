package iisscc;
import java.io.*;
public class copyprog1
{//declaring the class
    public static void main(String args[])throws IOException
    {//defining the main method
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String fn,fwn,s;
        int i,p;//declaring variables
        System.out.println("Enter the name of the file");
        fn=br.readLine();
        FileReader fr=new FileReader(fn);
        BufferedReader br1=new BufferedReader(fr);
        System.out.println("Enter the name of the file in which the prog is to be wrtten");
        fwn=br.readLine();
        //writing and copying to another file
        FileWriter fw=new FileWriter(fwn);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        while((s=br1.readLine())!=null)
        {
            p=s.length();
            for(i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='/')
                {
                    p=i;
                    break;
                }
            }
            s=s.substring(0,p);
            pw.println(s);
        }
        pw.close();
        FileReader fr1=new FileReader(fwn);
        BufferedReader br2=new BufferedReader(fr1);
        while((s=br2.readLine())!=null)
        {
            System.out.println(s);//printing the result
        }
    }//end of main
}//end of class