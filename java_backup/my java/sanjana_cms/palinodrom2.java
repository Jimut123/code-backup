import java.io.*;
class palinodrom2
{
    public static void main () throws IOException
    {
        String S;
        int i,f,j;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a String");
        S=br.readLine();
        f=0;
        j=S.length()-1;
        for (i=0;i<S.length()-1;i++,j--)
        {
            if (S.charAt(i)!=S.charAt(j))
            {
            f=1;
            break;
        }
    }
    if(f==0)
    System.out.println ("Palinodrom number:"+S);
    else
    System.out.println ("Non-Palinodrom number:"+S);
}
}