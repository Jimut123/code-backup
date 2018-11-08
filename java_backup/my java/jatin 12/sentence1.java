 import java.io.*;
 class sentence1 
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int t,i,j,k;
         String s,w="";
         System.out.println("Enter your paragraph");
         s=br.readLine();
         String a[]=new String[10];
         t=0;
         s=s.toUpperCase();
         for(i=0;i<s.length();i++)
         {
             if(s.charAt(i)=='.'&&s.charAt(i+1)==' '||
                s.charAt(i)==','&&s.charAt(i+1)==' '||
                s.charAt(i)=='!'&&s.charAt(i+1)==' '||
                s.charAt(i)=='?'&&s.charAt(i+1)==' ')
             {
                 w=w+s.charAt(i);
                 a[t++]=w;
                 w="";
                 i++;
                }
             else
             w=w+s.charAt(i);
            }
          for(i=0;i<t;i++)
            a[i]=a[i]+" ";
         for(i=0;i<t;i++)
         {
             for(j=65;j<=90;j++)
              {
                  w="";
                  for(k=0;k<a[i].length();k++)
                  {
                      if(a[i].charAt(k)==' ')
                         {
                             if(w.charAt(0)==(char)j)
                                System.out.print(w+" ");
                             else
                             if(w.charAt(0)==(char)(j+32))
                                System.out.print(w+" ");
                            w="";
                        }
                        else
                           w=w+a[i].charAt(k);
                        }
                    }
                }              
        }
    }