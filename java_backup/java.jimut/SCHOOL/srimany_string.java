import java.io.*;
class srimany_string
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        int i,l,c=0,n=0,g=0,j,p=0;
        String s,m="";
        char ch;
        //THIS IS A STRING PROGRAM.IS THIS EASY?YES IT IS.
        System.out.println("Enter a text, and note you should not allow space between any special characters and only use '.' , '?' and '!' not else:");
        s=cd.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch!='.')&&(ch!='?')&&(ch!='!')&&(ch!=' '))
            {
                m=m+ch;
            }
             else if((ch=='.')||(ch=='?')||(ch=='!')||(ch==' '))
            {
                c++;
                m="";
            }
             if((ch=='.')||(ch=='?')||(ch=='!'))
            {
                n++;
            }
        }
        String m1[] = new String[c];
        if(n>4)
        {
            System.out.println("ERROR MESSAGE! you cannot enter more than 4 sentences.");
        }
         if(n<=4)
        {
            System.out.println("Total no.of words:"+c);
           for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch!='.')&&(ch!='?')&&(ch!='!')&&(ch!=' '))
            {
                m=m+ch;
            }
            else if((ch=='.')||(ch=='?')||(ch=='!')||(ch==' '))
            {
                m1[g]=m;
                g++;
                m="";
            }
        
        }
        System.out.println("Word\t\t\tFrequency");
            for(i=0;i<c-1;i++)
         {
            for(j=0;j<c;j++)
            {
                if(m1[i].equals(m1[j]))
                {
                    p++;
                }
              
             }
            
               System.out.println(m1[i]+"\t\t\t"+p);
             p=0;
         }
        }
    }
 }