import java.util.*;
class String_pat2
{
    String s="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        s=sc.nextLine();
        s=s+" ";
    }
    void calc()
    {
        String z="";
        String t="";
        int cr=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z=z+s.charAt(i);
            else
            {
                cr=0;
                for(int j=0;j<z.length();j++)
                {
                    if(z.charAt(j)=='a'||z.charAt(j)=='e'||z.charAt(j)=='i'||z.charAt(j)=='u'||z.charAt(j)=='o')
                    cr=cr+1;
                }
                if(cr==0)
                t=t+z+" ";
                else
                t=z+" "+t;
                z="";
            }
        }
        System.out.println(t+" ");
    }
    void main()
    {
        String_pat2 sd=new String_pat2();
        sd.input();
        sd.calc();
    }
}
