 import java.io.*;
 class encryption
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         int i,l,a=0,s;
         String str1,str2="";
         char chr;
         System.out.println("Enter coded text : ");
         str1=cd.readLine();
         System.out.println("Enter shift : ");
         s=Integer.parseInt(cd.readLine());
         if((s<1)||(s>26))
          System.out.println("Invalid Entry");
          else
         {
             l=str1.length();
             for(i=0;i<l;i++)
             {
                 chr=str1.charAt(i);
                 if(Character.isUpperCase(chr))
                 {
                 a=(int)chr+(s-1);
                 if((char)a=='Q')
                 {
                     if(str1.charAt(i+1)+(s-1)=='Q'&&i<l)
                     {
                         a=32;
                         i++;
                        }
                    }
                    if(a>90)
                    a=a-26;
                    str2=str2+(char)a;
                }
                else
                {
                    
                }
            }
            }
             System.out.println("Decoded Text: "+str2);
        }
    }