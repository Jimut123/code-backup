import java.io.*;
class Snowy_2005
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,r="";
        int i,l,j,count=0,v=0;
        char ch;
        System.out.println("Enter a String::");
        s=cd.readLine();
        s=s.toUpperCase();
        
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                count++;
            }
            if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
            {
                v++;
            }
            r=ch+r;
        }
        System.out.println("Total number of characters:"+count);
        System.out.println("Total number of vowels:"+v);
        System.out.println("Reverse String:"+r);
        }
    }