package func_rec_;
import java.util.*;
class String_freq
{
    String s="";
    int f;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        s=sc.nextLine();
    }
    void calc()
    {
        for(int i=0;i<s.length();i++)
        {
            int fr;
            f=0;
            fr=frequency(s,s.charAt(i),i);
            System.out.print("Frequency of "+s.charAt(i)+" = "+fr);
        }
    }
    int frequency(String s,char ch,int i)
    {
        if(i>s.length()-1)
        return f;
        else if(s.charAt(i)==ch)
        return f+1+frequency(s,ch,i+1);
        else
        return frequency(s,ch,i+1);
    }
}