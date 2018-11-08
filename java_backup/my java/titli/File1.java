//writing lines in a file and displaying the total no. of vowels
import java.io.*;
class File1
{
   
   public static void main(String args[])
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
      String s1="yes";
       try
       {
          FileOutputStream out=new FileOutputStream("myfile.txt");
           PrintStream p=new PrintStream(out);
           while(s1.equalsIgnoreCase("yes")==true)
          {
           System.out.println("enter a string");
           String s=br.readLine();
           //
           p.println(s);
           System.out.println("Enter a another string(Yes/No):");
           s1=br.readLine();
        }
           p.close();
        }
        catch(Exception e)
         {
             System.out.println("error occured while writing to file");
            }
        }
     public static void main1(String args[])
     {
       int c=0;
       try
       {
           FileInputStream fstream=new FileInputStream("myfile.txt");
           DataInputStream in=new DataInputStream(fstream);
           while(in.available()!=0)
           {
            String s=in.readLine();
             System.out.println("The String is = "+s);
           int l=s.length();
           c=0;
           for(int i=0;i<l;i++)
           {
               char ch=s.charAt(i);
               if (ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                 c=c+1;
                }
             System.out.println("no. of vowels = "+c);
            }
               
           in.close();
        }
        catch(Exception e)
        {
            System.out.println("file input error");
        }
    }
}