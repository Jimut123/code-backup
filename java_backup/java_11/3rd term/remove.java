import java.io.*;
class remove
{
    String a="",m="";
    int i,l,j;
    char c,ch;
   void repeat(String s) 
   {
       l=s.length();
        if(s.charAt(0)!=s.charAt(1))
        {
             a=a+s.charAt(0);
        }
       for(i=0;i<l-1;i++)
       {
        ch=s.charAt(i);
        c=s.charAt(i+1);
       
         if(c!=ch)
         {
             a=a+c;
            }
        }
       System.out.println(a);
   }
   void encode(int h)
   {
       if(h>0)
       {
           for(i=0;i<s.length();i++)
           {
               c=s.charAt(i);
               if(((int)c+h)<91)
               {
               for(j=(int)c;j<=((int)c+h);j++)
               {
                   if(j==((int)c+h))
                   {
                       ch=(char)j;
                       m=m+(char)j;
                   }
                   s=j;
                   
                }
                else
                {
                     for(j=(int)c;j<=((int)c+h);j++)
                {
                   if(j==((int)c+h))
                   {
                       ch=(char)j;
                       m=m+(char)j;
                   }
                }
                }
            }
       }  
   }
   public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a string:");
        remove ob = new remove();
        String s1=cd.readLine();
        ob.repeat(s1);
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        