import java.io.*;
class piglatin
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         String s,m="",n="",s1="",s2;
         int i,j,l1,l,p=0;
         char ch,c;
        
         System.out.println("Enter a sentence::");
         s = cd.readLine();
         l = s.length();
         for(i=0;i<l;i++)
         {//start of for loop
            ch = s.charAt(i);
            if((ch!=' ' )&&(ch!=' ' ))
            {
                m=m+ch;
            }
            else if((ch == ' ')||(ch=='.'))
            {
                l1 = m.length();
                for(j=0;j<l1;j++)
                {
                    c = m.charAt(j);
                    if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                    {
                        p = j;
                        break;
                    }
                }
                n = m.substring(0,p);
                s1 = m.substring(p,l1);
                s2 = s1+n+"ay";
                
                System.out.println(s2+" " );
                m="";
                j=0;
            }
        }
    }
}
              
 
            
            
            
            
            
            
            