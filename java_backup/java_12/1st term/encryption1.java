 import java.io.*;
 class encryption1
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         String s,s1="";
         int i,l,k,v,m;
         char ch,c;
         System.out.println("Enter a sentence:");
         s=cd.readLine();
          System.out.println("Enter the key:");
         k=Integer.parseInt(cd.readLine());
         l=s.length();
         for(i=0;i<l;i++)
         {
             ch=s.charAt(i);
             if((int)ch>=97)
             {
                m=(int)ch;
                v=m+k;
                if(v>122)
                {
                    v=v-122+96;
                    c=(char)v;
                    s1=s1+c;
                }
                else
                {
                    c=(char)v;
                    s1=s1+c;
                }
            }
            else if(Character.isUpperCase(ch))
            {
                v=(int)ch+k;
                if(v>90)
                {
                    v=v-90+64;
                    c=(char)v;
                    s1=s1+c;
                }
                else
                {
                    c=(char)v;
                    s1=s1+c;
                }
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println(s1);
    }
}
            
            
           
            
            
            
            
            
            
            
            
            
            
            
            