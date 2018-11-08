import java.io.*;
class vowel
{
    public static void main()throws IOException
    {
        String S, W, W1;
        int i,j;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
         W="";
         S=S+" ";
         int v=0;
         for(i=0;i<S.length();i++)
         {
             if (S.charAt(i)==' ')
             {
                 v=0;
                 for (j=0; j<W.length(); j++)
                 if (W.charAt(j)=='A'||W.charAt(j)=='a'||W.charAt(j)=='E'||W.charAt(j)=='e'||W.charAt(j)=='I'||W.charAt(j)=='i'||W.charAt(j)=='O'||W.charAt(j)=='o'||W.charAt(j)=='U'||W.charAt(j)=='u')
                 v++;
                 if (v==0)
                 System.out.println(W);
                 W="";
             }
                W=W+S.charAt(i);
            }
        }
    }

                 