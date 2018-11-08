import java.util.*;
public class string2
{
    Scanner sc=new Scanner(System.in);
    String s;
    String ar[];
    int c=0;
    void input()
    {
        System.out.println("Enter sentence");
        s=sc.nextLine();
    }
    void array()
    {
        int m;
        String w="";
        for(m=0;m<s.length();m++)
        {
            if(s.charAt(m)==' ')
            {
                c+=1;
            }
        }
        ar=new String[c+1];
        c=0;
        for(m=0;m<s.length();m++)
        {
            if(s.charAt(m)==' ')
            {
                ar[c]=w;
                w="";
                c++;
            }
            if(s.charAt(m)=='a')
            {
                w+='e';
            }
            else if(s.charAt(m)=='e')
            {
                w+='i';
            }
            else if(s.charAt(m)=='o')
            {
                w+='u';
            }
            else if(s.charAt(m)=='u')
            {
                w+='a';
            }
            else if(s.charAt(m)=='i')
            {
                w+='o';
            }
            else
            {
                w+=s.charAt(m);
            }
        }
        ar[c]=w;
    }
    void dis()
    {
        int m;
        for(m=0;m<c+1;m++)
        {
            System.out.println(ar[m]);
        }
    }
}        