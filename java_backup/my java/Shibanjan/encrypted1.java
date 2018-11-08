import java.io.*;
class encrypted1
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        s=br.readLine();
        char w;
        int i,x;
        String s1="",s2="";
        for(i=0;i<s.length();i++)
        {
            w=s.charAt(i);
            s1=s1+w;
            x=Integer.parseInt(s1);
            if(x>=65&&x<=90||x>=97&&x<=122)
            {
                s2=s2+(char)x;
                s1="";
            }
            else
            {
                if(x==32)
                {
                    s2=s2+(char)x;
                    s1="";
                }
            }
        }
        System.out.print(s2);
    }
// import java.io.*;
// class encrypted1
// {
//     public static void main(String arg[])throws IOException
//     {
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         String s;
//         s=br.readLine();
//         char w;
//         int i,x;
//         String s1="",s2="";
//         for(i=0;i<s.length();i++)
//         {
//             w=s.charAt(i);
//             s1=s1+w;
//             x=Integer.parseInt(s1);
//             if(x>=65&&x<=90||x>=97&&x<=122)
//             {
//                 s2=s2+(char)x;
//                 s1="";
//             }
//             else
//             {
//                 if(x==32)
//                 {
//                     s2=s2+(char)x;
//                     s1="";
//                 }
//             }
//         }
//         System.out.print(s2);
//     }
}