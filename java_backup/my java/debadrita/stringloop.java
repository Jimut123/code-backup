
public class stringloop
   {
       public static void main()
           {
               char ch;
               int i,j,n;
               String s="COMPUTER";
               n=s.length();
               for(i=0;i<n;i++)
               {for(j=0;j<=i;j++)
                   System.out.print(s.charAt(j));
                System.out.println("");   
              } 
            }       
        }