package project1_May2016;

//to do abbreviation in strings
import java.io.*;
class abbreviation
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        String s,w;
        //input
        System.out.println("Enter String");
        s=br.readLine();
        w="";
        //starting of loop
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                System.out.print(w.charAt(0));
                System.out.print(".");
                w="";
            }
            else
            w=w+s.charAt(i);
        }
        System.out.print(w);
    }
}