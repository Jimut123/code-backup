package prac_exam;
import java.util.*;
class Encode
{
    String s;
    int n;
    Encode()
    {
        s="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String ");
        s=sc.nextLine();
        System.out.print("Enter number ");
        n=sc.nextInt();
    }
    void Encode()
    {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                int z=(int)ch;
                z=z+n;
                ch=(char)z;
                System.out.print(Check(ch));
            }
            else
            System.out.print(" ");
        }
    }
    char Check(char ch)
    {
        if((ch>'Z'&&ch<'a')||ch>'z')
        {
            int z=(int)ch;
            z=z-26;
            ch=(char)z;
            return ch;
        }
        else if(ch<'A'||(ch<'a'&&ch>'Z'))
        {
            int z=(int)ch;
            z=z+26;
            ch=(char)z;
            return ch;
        }
        return ch;
    }
    void main()
    {
        accept();
        Encode();
    }
}
            