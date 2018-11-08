import java.io.*;
class  telegraph
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String n,s="";
        char ch;
        int l,i,count=0;
        System.out.println("Enter a text : ");
        n=cd.readLine();
        l=n.length();
        for(i=0;i<l;i++)
        {
            ch=n.charAt(i);
            if((ch!=' ')&&(ch!='.'))
            {
                s=s+ch;
            }
            else
            {
                count++;
            }
        }
        if(count<=10)
        {
            System.out.println("Rs 2");
        }
         else if((count>=11)&&(count<=20))
        {
            System.out.println("Rs 5");
        }
         else if((count>=21)&&(count<=30))
        {
            System.out.println("Rs 7");
        }
        else  if(count>=30)
        {
            System.out.println("Rs 9");
        }
    }
}