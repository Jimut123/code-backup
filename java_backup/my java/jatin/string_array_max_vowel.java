import java.io.*;
class string_array_max_vowel   
    {
       public static void main(String args[])throws IOException
            {
                int i,j,n,k=0,t=0,m=0;
                InputStreamReader ISR=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(ISR);
                n=Integer.parseInt(br.readLine());
                String s[]=new String[n];
                System.out.println("give strings");
                for(i=0;i<n;i++)
                s[i]=br.readLine();
                
                for(i=0;i<n;i++)
                    {
                       t=0;
                        for(j=0;j<s[i].length();j++)  
                        if(s[i].charAt(j)=='A'||
                        s[i].charAt(j)=='E'||
                        s[i].charAt(j)=='I'||
                        s[i].charAt(j)=='O'||
                        s[i].charAt(j)=='U'||
                        s[i].charAt(j)=='a'||
                        s[i].charAt(j)=='e'||
                        s[i].charAt(j)=='i'||
                        s[i].charAt(j)=='o'||
                        s[i].charAt(j)=='u')
                        t++;
                        if(t>k)
                        {
                        k=t;
                        m=i;
                    }
                       
                    }
                     System.out.println(s[m]+"   "+k);
                }      
            }
                    