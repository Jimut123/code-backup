import java.io.*;
class Appear
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A sentence");
        String s=br.readLine();
        s=s+' ';
        String w=br.readLine();
        String w1="";
        int s1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                //System.out.println("T");
                if(w1.equalsIgnoreCase(w)==true)
                {
                    s1++;
                    
                }
              w1="";  
            }
            else
                w1=w1+s.charAt(i);
        }
        System.out.println(+s1);
    }
}

            