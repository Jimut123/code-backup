import java.io.*;
class palinodrom1
{
    public static void main()throws IOException
    {
        String S;
        int i,j;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
        j=S.length()-1;
        int f=0;
        for (i=0;i<S.length();i++,j--)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                f=1;
                break;
            }
        }
        if(f==0)
        System.out.println("palinodrom:"+S);
        else
        System.out.println("non palinodrom:"+S);
    }
}
        