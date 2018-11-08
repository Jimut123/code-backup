//this program will reverse the order of words without punctuation
import java.io.*;
class Reverse
{
    private String str[];
    private int n;
    public void get()
    {
        try{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input:\nN=");
            n=Integer.parseInt(br.readLine());
            str=new String[n];
            for(int i=0; i<n; i++)
                do{
                    str[i] = br.readLine();
                    if(".,:;?/|".indexOf(str[i].charAt(str[i].length()-1))==-1) System.out.println("Re-enter this line; terminate the sentence\n");
                }while(".,:;?/|".indexOf(str[i].charAt(str[i].length()-1))==-1);
        }catch(Exception e){}
    }

    public void show()
    {
        String sentence="", wd="";
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<str[i].length(); j++)
            {
                if("',.:; ?!".indexOf(str[i].charAt(j))!=-1) {sentence = wd + " " + sentence; wd="";}
                else wd+=str[i].charAt(j);
            }            
        }
        System.out.println("Output:\n" + sentence);
    }
}

public class ReverseSentenceOnly
{
    public static void main(String args[])
    {
        Reverse r=new Reverse();
        r.get();
        r.show();
    }
}