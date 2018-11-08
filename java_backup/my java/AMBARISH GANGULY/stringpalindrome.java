import java.io.*;
class stringpalindrome
{
   public static void main()throws IOException
   {
       int i;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s;int l;int j;int f;
      System.out.print("enter string");
       s = br.readLine();
       l=s.length();
       j=l-1;f=0;
       for(i=0;i<=l/2;i++)
     
      { if(s.charAt(i)!=s.charAt(j))
          {
              f=1;
           break;
        }
        j--;
    }
 if(f==0)
    System.out.print("palindrome");
    else
    System.out.print("not palindrome");
}
}
