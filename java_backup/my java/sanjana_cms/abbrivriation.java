import java.io.*;
class abbrivriation
{
    public static void main()throws IOException
    {
        String S, W, W1;
        int i;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
         W="";
        for (i=0;i<S.length();i++)
        {
            if(S.charAt (i)==' ')
            {
                System.out.print(W.charAt(0));
                System.out.print(".");
                W="";
            }
            else
            W=W+S.charAt(i);
        }
        System.out.println(W);
    }
}