import java.io.*;
class maxvowel
{
    public static void main()throws IOException
    {
        String S, W, W1;
        int i,j,max,v;
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S=br.readLine();
         W="";  W1="";
        S=S+""; max=0;
        for(i=0;i<S.length();i++)
        {
            if (S.charAt(i)==' ')
            {
            v=0;
            for(j=0; j<W.length();j++)
            if (W.charAt(j)=='A'||W.charAt(j)=='a'||W.charAt(j)=='E'||W.charAt(j)=='e'||W.charAt(j)=='I'||W.charAt(j)=='i'||W.charAt(j)=='O'||W.charAt(j)=='o'||W.charAt(j)=='U'||W.charAt(j)=='u')
            v++;
            if (v>max)
            {
                max=v;
                W1=W;
            }
            W="";
        }
        W=W+S.charAt(i);
    }
    System.out.println(W1+"count"+max);   
}
}
        