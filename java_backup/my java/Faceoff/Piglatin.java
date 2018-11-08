import java.io.*;
class Piglatin
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        s=s.toUpperCase();
        int l=s.length();
        int p=0;
        for(int i=0;i<l;i++)
        {
           char a=s.charAt(i);
           if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
           {
           p=i;
           break;
           }//End of if
        }//End of for()
        
        for(int i=p;i<l;i++)
        System.out.print(s.charAt(i));
        for(int i=0;i<p;i++)
        System.out.print(s.charAt(i));
        System.out.println("AY");
    }//End of main()
}//End of class
