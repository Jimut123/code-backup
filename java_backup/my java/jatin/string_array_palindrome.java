import java.io.*;
class string_array_palindrome  
    {
       public static void main(String args[])throws IOException
            {
                int i,j,n,k,l;
                String w="",w1="";
                InputStreamReader ISR=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(ISR);
                n=Integer.parseInt(br.readLine());
                String s[]=new String[n];
                System.out.println("give strings");
                for(i=0;i<n;i++)
                s[i]=br.readLine();
                for(i=0;i<n;i++)
                    {
                        w1="";
                        for(j=0;j<s[i].length();j++)  
                        {
                        int f=0;
                            if(s[i].charAt(j)==' ')
                        {
                        
                            for(l=0,k=w1.length()-1;l<w1.length()/2;l++,k--)
                    {
                        if(w1.charAt(l)!=w1.charAt(k))
                        {
                            f=1;
                            break;
                        }
                        }
                        if(f==0)
                        System.out.println(s[i]);
                             w1="";
                            }
                                else 
                                w1=w1+s[i].charAt(i);
                            }
                           
                    }
                }
            }