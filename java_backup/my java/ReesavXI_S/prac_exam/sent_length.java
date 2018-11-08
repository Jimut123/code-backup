package prac_exam;
import java.util.*;
import java.io.*;
class sent_length
{
    String s="";
    void accpet()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.print("Enter a sentence ");
        s=in.readLine();
        s=s+" ";
    }
    void calc()
    {
        int z=words_count(s);
        int len[]=new int[z];
        String wrds[]=new String[z];
        int k=-1;
        int temp=0;
        String z1="";
        String temps="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z1=z1+s.charAt(i);
            else
            {
                len[++k]=z1.length();
                wrds[k]=z1;
                z1="";
            }
        }
        for(int i=0;i<z;i++)
        {
            for(int j=0;j<z-i-1;j++)
            {
                if(len[j]>len[j+1])
                {
                    temp=len[j];
                    len[j]=len[j+1];
                    len[j+1]=temp;
                    temps=wrds[j];
                    wrds[j]=wrds[j+1];
                    wrds[j+1]=temps;
                }
            }
        }
        for(int i=0;i<z;i++)
        {
            System.out.print(wrds[i]+" ");
        }
    }
    int words_count(String s)
    {
        int cr=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            cr++;
        }
        return cr;
    }
}