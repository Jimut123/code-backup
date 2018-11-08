import java.io.*;
public class FILE2
{
   public static void main(String args[])throws IOException
   {
       FileReader fr=new FileReader("name.txt");
       BufferedReader br=new BufferedReader(fr);
       String text;
       int i=0;
       while((text=br.readLine())!=null)
       {
           System.out.println(text);
           for(i=0;i<text.length();i++)
           {
               char z=text.charAt(i);
               if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
               i++;
            }
            System.out.println(text+" "+i);
        }
    }
}
