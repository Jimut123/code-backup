import java.io.*;
        public class kapricar
         {
    public static void main(String args[])throws IOException
            {
         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
           int m,n,n1,s,s1,c,k,rev;
           System.out.println("User!:Enter a number please:=");
           n=Integer.parseInt(br.readLine());
           m = n*n;
           n1=n;
          k=0;
        while(n1>0)
        {
         k++;
         n1=n1/10;
       }
       n1=n;
       c=1;
      s=0;
       while(c<=k)
         {
        s=(s*10)+n1%10;
        n1=n1%10;
         c++;
         }
        rev = 0;
        while(s>0)
         {
        rev = (rev*10)+s%10;
        s= s%10;
       }
       s1=0;
         while(n>0)
         {
               s1=(s*10)+n%10;
          n=n/10;
        }
          if(s1+rev == n)
          System.out.println("Kapricor");
        else
         System.out.println("Default");
         }
  }

