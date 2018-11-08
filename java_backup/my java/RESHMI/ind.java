import java.io.*;
class ind

   {
       public static void  main(String args[])throws IOException
       
       {
           int i,w;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s;
           System.out.println("Enter String");
           s=br.readLine();
           w=0;
           for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                
               w++;
            }
        }
        w=w+1;
        System.out.println("Total word"+w);
    }
}

































