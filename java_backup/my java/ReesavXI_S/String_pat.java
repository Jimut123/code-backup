import java.util.*;
class String_pat
{
    String s="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String = ");
        s=sc.nextLine();
    }
    void calc()
    {
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        a[i]=s.charAt(i);
        int mid=(s.length())/2;
        int k=mid;
        int j=k+1;
        int h=-1;
        while(mid>=0&&j<=s.length())
        {
            for(k=mid;k<j;k++)
             System.out.print(s.charAt(k));
            h=h*-1;
            if(h==1)
                mid=mid-1;
                else
                j=j+1;
            System.out.println();
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String_pat sv=new String_pat();
        sv.input();
        sv.calc();
    }
}
            