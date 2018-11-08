import java.io.*;
class piglatin

 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String s;
         s=br.readLine();
         int i,p;
         p=0;
         for(i=0;i<s.length();i++)
         {
             if(s.charAt(i)=='s' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u')
             {
                 p=i;
                 break;
                }
            }
            for(i=p;i<s.length();i++)
            System.out.print(s.charAt(i));
            for(i=0;i<p;i++)
            System.out.print(s.charAt(i));
            System.out.print("Ay");
        }
    }
    
     
