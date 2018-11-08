import java.util.*;
public class sentence
{
    Scanner sc=new Scanner(System.in);
    String ar[];
    String s;
    int c;
    void input()
    {
        System.out.println("Enter paragraph");
        s=sc.nextLine();
    }
    void store()
    {
        String w="";
        int a;
        c=0;
        for(a=0;a<s.length();a++)
        {
            if(s.charAt(a)=='.' || s.charAt(a)=='!' || s.charAt(a)=='?')
            {
               c++;
            }
        }
        ar=new String[c+1];
        c=0;
        for(a=0;a<s.length();a++)
        {
            w=w+s.charAt(a);
           if(s.charAt(a)=='.' || s.charAt(a)=='!' || s.charAt(a)=='?')
           {
               ar[c]=w;
               w="";
               c++;
           }
        }
        ar[c+1]=w;
    }
    void manipulate()
    {
        int c2,m,n,m1,n1;
        String w="",str1,str2,k1="",k2="",k3;
        c2=0;
        for(m=0;m<c+1;m++)
        {
            c2=0;
            for(n=0;n<ar[m].length();n++)
            {
                if(ar[m].charAt(n)==' ')
                {
                    c2++;
                }
            }
            String ar2[]=new String[c2+1];
            c2=0;
            for(n=0;n<ar[m].length();n++)
            {
                if(ar[m].charAt(n)==' ')
                {
                    ar2[c2]=w;
                    w="";
                    c2++;
                }
                w+=ar[m].charAt(n);
            }
            ar2[c2+1]=w;
            w="";
            
            for(m1=0;m1<ar2.length;m++)
            {
                for(n1=0;n1<ar2.length-1;n1++)
                {
                    if(ar2[n].charAt(ar2[n].length()-1)=='.' || ar2[n].charAt(ar2[n].length()-1)==',')
                    {
                        str1=ar2[n].substring(0,ar2[n].length()-1);
                        k1+=ar2[n].charAt(ar2[n].length()-1);
                    }
                    else
                    {
                        str1=ar2[n];
                        k1="";
                    }
                    if(ar2[n+1].charAt(ar2[n+1].length()-1)=='.' || ar2[n+1].charAt(ar2[n+1].length()-1)==',')
                    {
                        str2=ar2[n+1].substring(0,ar2[n+1].length()-1);
                        k2+=ar2[n+1].charAt(ar2[n+1].length()-1);
                    }
                    else
                    {
                        str2=ar2[n+1];
                        k2="";
                    }
                    if(str1.compareTo(str2)>0)
                    {
                        k3=str1;
                        ar2[n]=str2+k1;
                        ar2[n+1]=str1+k2;
                    }
                }   
            }
            for(m1=0;m1<ar2.length;m1++)
            {
               System.out.print(ar2[m1]+" ");
            }
            }
        }
    }