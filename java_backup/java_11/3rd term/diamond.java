import java.io.*;
class diamond
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s="DIAMOND";
        int l=8,i;
        int k=4,p=4;
        for(i=0;i<=l/2;i++)
        {
            
            
                System.out.println(s.substring(0,k)+s.substring(p,l));
                k--;
                p++;
            
          
             
        }
    }
}
       