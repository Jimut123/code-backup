import java.io.*;
class reverse_vowels
{
    public static void main(String args[])throws IOException
    {
     InputStreamReader ab = new InputStreamReader(System.in);
     BufferedReader cd = new BufferedReader(ab);
     String s,m="",r="";
     int i,l,j,p;
     char ch,c;
     System.out.println("Enter a text(in capital letters) : ");
     s=cd.readLine();
     s=s+' ';
     s=s.toUpperCase();
     l=s.length();
     for(i=0;i<l;i++)
     {
         ch=s.charAt(i);
         if(ch!=' ')
         {
             m=m+ch;
         }
         else if(ch==' ')
         {
             //System.out.print(m);
             p=m.length();
             for(j=0;j<p;j++)
             {
                 c=m.charAt(j);
                 if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
                 {
                     r=r+c;
                 }
             }
             for(j=0;j<p;j++)
             {
                 c=m.charAt(j);
                 if((c!='A')&&(c!='E')&&(c!='I')&&(c!='O')&&(c!='U'))
                 {
                     r=r+c;
                 }
             }
             m="";
             r=r+' ';
         }
         //System.out.println();
      }
     System.out.println(r);
    }
}
     