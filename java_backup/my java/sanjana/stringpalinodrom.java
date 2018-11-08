 

import java.io.*;
class stringpalinodrom
{
    public static void main()throws IOException
    {
        String S;
       int i,w,f,j;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
        f=0;
        for (i=0,j=S.length()-1;i<S.length()/2;i++,j--)
        {
            if (S.charAt(i)!=S.charAt(j))
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
