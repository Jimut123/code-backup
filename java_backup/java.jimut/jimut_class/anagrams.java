import java.io.*;
class anagrams
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         String n,m,g,k,x="",y="";
         int i,j,l,lt;
         char h,h1;
        
         System.out.println("Enter the first word in capital letters");
         n = cd.readLine();
         System.out.println("Enter the second word in capital letters");
         m = cd.readLine();
         g = n;
         k =m;
         l = g.length();
         lt = k.length();
         for(i=65;i<90;i++)
         {//start of for loop
            h = (char)(i);
             for(j=0;j<l;j++)
                  {
                     h1 = g.charAt(j);
                     if(h==h1)
                     {
                         x=x+h;
                        }
                    }
                  }
         for(i=65;i<90;i++)
         {
            h = (char)(i);
             for(j=0;j<lt;j++)
                  {
                     h1 = k.charAt(j);
                     if(h==h1)
                     {
                         y=y+h;
                        }
                    }
                }
         if(x.equals(y))
         {
            System.out.println(m+" and "+n+" are annagram words");
         }
         else
         {
            System.out.println(m+" and "+n+" are not annagram words");
          }
       }
            
 }
            
            
            
            
            
            
            