import java.io.*;
class frq
{
 InputStreamReader read=new InputStreamReader(System.in);
 BufferedReader in=new BufferedReader(read);
 String s;int c=0;
 void count()throws IOException
 {
     //String s;
   System.out.println("Enter your string");
   s=in.readLine();
     for(int j=65;j<=90;j++)
     {
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)==(char)j)
         c++;
        }
     if(c>0)
     System.out.println("Frequency of"+(char)j+"="+c);

     c=0;
    }
    for(int j=97;j<=122;j++)
     {
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)==(char)j)
         c++;
        }
     if(c>0)
     System.out.println("Frequency of"+(char)j+"="+c);
     c=0;
    }
}
public static void main(String ar[])throws IOException
{
   BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
   
   frq f=new frq();
   f.count();
}
}
