import java.io.*;
class stringpalinodrom
{
    public static void main()throws IOException
    {
        String S;
       int i,w,f;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
        f=0;
        for (i=0;i<S.length();i++)
        {
            if (S.charAt(i)!=S.charAt(i))
            {f=1;
                break;
            }
        }
        if (f==0)
        System.out.println("Palinodrom:"+S);
        else
        System.out.println("Non Palinodrom:"+S);
    }
}
