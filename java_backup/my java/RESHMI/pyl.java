import java.io.*;
class pyl
  
   {
       public static void main(String args[])throws IOException
       {
           int i,j,f;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s;
           System.out.println("Enter String");
           s=br.readLine();
           f=0;
           for(i=0,j=s.length()-1;i<s.length()/2;i++,j--)
           {
               if(s.charAt(i)!=s.charAt(j))
               {
                   f=1;
                   break;
                }
            }
            if(f==0)
            System.out.println("palindrum: "+s);
            else
            System.out.println("non-palindrum: "+s);
        }
    }