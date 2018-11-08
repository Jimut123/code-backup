import java.io.*;
class largest_vowel
  {
    public static void main () throws IOException 
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter A Sentence:");
         String st=br.readLine();
         String word="";
         String largeword="";
         int i,l,lw,max=0,c=0,v=0;char ch;
         st=st+" ";
         l=st.length();
         for(i=0;i<l;i++)
         {
             if(st.charAt(i)==' ')
             {
                 if(word.length()>max)
                 {
                     max=word.length();
                     largeword=word;
                     word="";
                    }
                }
                    else
                    word=word+st.charAt(i);
                }
                System.out.println("The longest word:"+largeword+","+max);
               for(i=0;i<largeword.length();i++)
               {
               if(largeword.charAt(i)=='A'||largeword.charAt(i)=='a'||largeword.charAt(i)=='E'||largeword.charAt(i)=='e'||largeword.charAt(i)=='I'||largeword.charAt(i)=='i'||largeword.charAt(i)=='O'||largeword.charAt(i)=='o'||largeword.charAt(i)=='U'||largeword.charAt(i)=='u')
                      v++;
                    }
                 System.out.println("Total number of vowels:"+largeword+","+v);
     }
   }