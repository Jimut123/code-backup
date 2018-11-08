import java.io.*;
class dxdiag
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s,d,s1=0,k,i;
        System.out.println("Enter a number: ");
        n = Integer.parseInt(cd.readLine());
        while(n!=0)
        {
               System.out.println("Enter a number: ");
               n = Integer.parseInt(cd.readLine());
             
             s=n;
             while(s!=0)
             {
                 d=s%10;
                 s1=s1+1;
                 s=s/10;
             }
             if(s1%2==0)
             {
                 continue;
              }
             k=(s1+1)/2;
             String j="";
             j=Integer.toString(n);
             System.out.println(j.charAt(k-1));
        }
        
    }
}