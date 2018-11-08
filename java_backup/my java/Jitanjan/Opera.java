import java.io.*;
class Opera
{
 public static void main(String Args[]) throws IOException
 {String s;int f,i,j;
     char ch;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter Number Of Letters");
     int n=Integer.parseInt(br.readLine());
     if(n>6)
     System.out.println("Error!Length Of The String Should Not Exceed 6 Characters");
     else
     System.out.println("Enter The String");
     s=br.readLine();
     if(s.length()!=n)
     {
     System.out.println("Invalid!String Length Not Same As Specified!");
     }
     else
     { f=0;
      for(i=0;i<s.length();i++)
      {
           ch=(char)(s.charAt(i)+1);
          for(j=0;j<s.length();j++)
          
          if(s.charAt(j)==ch)
          {
              f=1;
              break;
          }
      }
      if(f==1)
      {
          System.out.println("Error! Only Alternate Letters Are Permitted!");
          System.exit(0);
      }
      f=0;
      for(i=0;i<(s.length());i++)
      {
          int m=(int)s.charAt(i);
          if(m>=97 && m<=122)
          {
              f=1;
              break;
          }
      }
      if(f==1)
      System.out.println("Only Upper Case Characters Are Permitted!");
      f=0;
      for(i=0;i<s.length();i++)
      {
          ch=s.charAt(i);
          f=0;
      for(j=i;j<s.length();j++)
      {
          
              if(s.charAt(j)==ch)
              {
             f++;
            }
              
                  
      }
      if(f>1)
      {
          System.out.println("Duplication of character");
         System.exit(0);
        }
    }
      System.out.println("VALID");
      
    }
}
}
         
          
     
 