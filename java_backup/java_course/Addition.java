import java.io.*;
class Addition
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String a,b,c1;
        char c,ch;
        int i,k,m,l,min,r=0,s=0,s1=0;
        System.out.println("Enter a number:");
        a=cd.readLine();
        System.out.println("Enter a number:");
        b=cd.readLine();
        k=a.length();
        m=b.length();
        if(m>k)
        {
            l=m;
            min=k;
            c1=a;
        }
        else
        {
            l=k;
            min=m;
            c1=b;
        }
        for(i=0;i<l;i++)
        {
            if(i<=min)
            {
               c=c1.charAt(i);
               s1=Integer.valueOf(c);
               System.out.print(s1);
            }
            ch=b.charAt(i);
            s=Integer.valueOf(ch);
            System.out.print(" "+s+"\t");
         }
        }
    }
