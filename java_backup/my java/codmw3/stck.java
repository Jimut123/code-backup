import java.util.*;
public class stck
{
    String a;
    int pos1=0,pos2=0,l2=0,l1=0;
    String s1[]=new String[a.length()];
    String s2[]=new String[a.length()];
    void input()
    {
        int b;
        for(b=0;b<a.length();b++)
        {
         s1[b]="";
         s2[b]="";
        }
        int fl,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        a=sc.nextLine();
        System.out.println("To Enter vowel press 1");
        System.out.println("To enter consonant press 2");
        System.out.println("To stop press 3");
        for(b=0;b<10;b++)
        {
            System.out.println("Enter choice");
            ch=sc.nextInt();
            fl=0;
            switch(ch)
            {
                case 1:
                vowels();
                break;
                case 2:
                consonants();
                break;
                case 3:
                fl=1;
                break;
            }
            if(fl==1)
            {
                break;
            }
        }
    }
        void vowels()
        {
            int b;
            char st;
            for(b=pos1;b<a.length();b++)
            {
                st=a.charAt(b);
                if(st=='a' || st=='e' || st=='o' || st=='u' || st=='i')
            {
                pos1=b+1;
                s1[l1]=s1[l1]+a.charAt(b);
                l1++;
                break;
            }
        }
    }
    void consonants()
    {
        int c;
        char st;
        for(c=pos2;c<a.length();c++)
            {
                st=a.charAt(c);
                if(st=='a' || st=='e' || st=='o' || st=='u' || st=='i')
                {
                    continue;
                }
                else
                {
                    pos2=c+1;
                    s2[l2]=s2[l2]+a.charAt(c);
                    l2++;
                }
            }
        }
    }
            
            
        