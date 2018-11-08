import java.io.*;
class string_array_alphabetical    
    {
        public static void main(String args[])throws IOException
            {
                int i,j,n;
                  InputStreamReader ISR=new InputStreamReader(System.in);
                  BufferedReader br=new BufferedReader(ISR);
                  n=Integer.parseInt(br.readLine());
                 String s[]=new String[n];
                 String t;
                   System.out.println("give strings");
                for(i=0;i<n;i++)
                s[i]=br.readLine();
               
                for(i=0;i<n-1;i++)
                    {
                    for(j=i+1;j<n;j++)   
                     if(s[i].compareTo(s[j])>0)
                     {
                         t=s[i];
                         s[i]=s[j];
                         s[j]=t;
                        }
                    }
                  
                for(i=0;i<n;i++)
                System.out.println(s[i]);
                }
            }
                        