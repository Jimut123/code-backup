package prac_exam;
import java.util.*;
class decode
{
    String s="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ASCII value ");
        s=sc.nextLine();
    }
    void clac()
    {
        String z="";
        char m;
        for(int i=0;i<s.length();i++)
        {
            z=z+s.charAt(i);
            if(Integer.parseInt(z)>=65&&Integer.parseInt(z)<=90)
            {
                m=(char)(Integer.parseInt(z));
                System.out.print(m);
                z="";
            }
            else if(Integer.parseInt(z)>=97&&Integer.parseInt(z)<=122)
            {
               m=(char)(Integer.parseInt(z));
                System.out.print(m);
                z="";
            }
            else if(Integer.parseInt(z)==32)
            {
                System.out.print(" ");
                z="";
            }
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        input();
        clac();
    }
}
            