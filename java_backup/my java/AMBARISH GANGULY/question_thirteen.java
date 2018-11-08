import java.io.*;
class question_thirteen
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s;int uc=0;int lc=0;int v=0;
System.out.print("enter String:");
s=br.readLine();
System.out.print("enter choice");
int d=Integer.parseInt(br.readLine());
  switch(d)
 { case 1:for(int i=0;i<s.length();i++)
            if(s.charAt(i)>=65&&s.charAt(i)<=90)
            uc++;
            System.out.print("Number of uppercase"+uc);
            break;
   case 2: for(int i=0;i<s.length();i++)
            if(s.charAt(i)>=97&&s.charAt(i)<=122)
            lc++;
           System.out.print("Number of lowercase"+lc);
           break;
   case 3: v=0;
                for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')               
                v++;
                System.out.print("Number of vowels"+v);
                break;
            default:System.out.print("bad program");
            break;
        }
   
}
}
