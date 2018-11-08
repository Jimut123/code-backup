import java.io.*;
class encrypt
{
    
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the encrypted no,");
        String s=in.readLine();
        double c=s.length();
        String w="";int i=0;int sum1=0;String sum="";
        char p;
        while(i<c)
        {
             p=s.charAt(i);
             sum=sum+p;
              sum1=Integer.parseInt(sum);
            while(sum1==0)
            {
                if(sum1>=65 && sum1<=90)
                {
                    w=w+(char)sum1;
                    sum1=0;
                }
                else if(sum1>=97 && sum1<=122)
                {
                    w=w+(char)sum1;
                    sum1=0;
                }
                else if(sum1==32)
                {
                    w=w+(char)sum1;
                    sum1=0;
                }
                sum1=0;
            }
            i++;
        }
        System.out.println(w);
    }
}