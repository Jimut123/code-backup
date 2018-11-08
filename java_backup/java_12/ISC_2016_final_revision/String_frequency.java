//ISC_2010_Question 3 on String frequency.
import java.io.*;
class String_frequency
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,s1="";
        int i,l,d=0,feq=1,n,m=0,j;
        char ch;
        System.out.println("Enter the number of sentences : ");
        n=Integer.parseInt(cd.readLine());
        if((n>=1)&&(n<4))
        {
            System.out.println("Enter the sentences : ");
            s=cd.readLine();
            l=s.length();
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
             if((ch=='.')||(ch=='?')||(ch==' '))
             {
                m=m+1;
             }
            }
            System.out.println("m = "+m);
            String a[]=new String[m];
            for(i=0;i<l;i++)
            {
                ch=s.charAt(i);
             if((ch!='.')&&(ch!='?')&&(ch!=' '))
             {
                s1=s1+ch;
             } 
             else
             {
                 a[d]=s1;
                 System.out.println(s1);
                 System.out.println("a["+d+"] = "+s1);
                 d++;
                 s1="";
                }
            }
            System.out.println("WORD\t\t\tFREQUENCY");
            for(i=0;i<m-1;i++)
            {
                for(j=i+1;j<m;j++)
                {
                    if((a[i].equals(a[j]))&&(a[i].equals("*")==false))
                    {
                        feq++;
                        a[j]="*";
                    }
                }
                if(a[i]!="*")
                {
                  System.out.println(a[i]+"\t"+feq);
                  feq=1;
                } 
            }
    }
}
}