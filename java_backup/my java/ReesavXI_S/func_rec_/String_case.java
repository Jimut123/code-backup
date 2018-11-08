package func_rec_;
import java.util.*;
class String_case
{
    String s="";
    String z="";
    int len=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string ");
        s=sc.nextLine();
        len=s.length();
    }
    char CaseConvert(char ch)
    {
        if((int)ch>=65&&(int)ch<=90)
        ch=(char)((int)(ch+32));
        else
        ch=(char)((int)(ch-32));
        return ch;
    }
    void RecChange(int l)
    {
        if(l==len)
        return;
        else
        {
            char ch=CaseConvert(s.charAt(l++));
            z=z+ch;
            RecChange(l);
        }
    }
    void display()
    {
        System.out.println("Original string "+s);
        System.out.println("Changed string "+z);
    }
}    