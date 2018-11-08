import java.io.*;
class date_difference
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String d1,d2,ex="";
        int da1=0,da2=0,mo1=0,mo2=0,ye1=0,ye2=0,c=0,i;
        char ch;
        System.out.println("Enter two dates in the form DD/MM/YYYY/ : ");
        d1=cd.readLine();
        d2=cd.readLine();
        for(i=0;i<d1.length();i++)
        {
            ch=d1.charAt(i);
            if(ch == '/')
            {
                c++;
            }
            else
            {
                ex=ex+ch;
            }
            if(c==1)
            {
                da1=Integer.parseInt(ex);
                ex="";
            }
             else if(c==2)
            {
                mo1=Integer.parseInt(ex);
                ex="";
            }
             else if(c==1)
            {
                ye1=Integer.parseInt(ex);
                ex="";
            }
        }
        c=0;
        for(i=0;i<d2.length();i++)
        {
            ch=d1.charAt(i);
            if(ch == '/')
            {
                c++;
            }
            else
            {
                ex=ex+ch;
            }
            if(c==1)
            {
                da2=Integer.parseInt(ex);
                ex="";
            }
             else if(c==2)
            {
                mo2=Integer.parseInt(ex);
                ex="";
            }
             else if(c==1)
            {
                ye2=Integer.parseInt(ex);
                ex="";
            }
        }
        System.out.println("Date1:"+da1+mo1+ye1);
    }
}














