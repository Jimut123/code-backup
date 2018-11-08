import java.io.*;
class encode2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String n;
        int l,s,k,i,o,oo;
        char ch,c,g;
        System.out.println("Enter a number,even:");
        n=cd.readLine();
        l=n.length();
        for(i=0;i<=l-2;i+=2)
        {
            k=0;
            ch=n.charAt(i);
            c=n.charAt(i+1);
            o=Integer.valueOf(ch);
            oo=Integer.valueOf(c);
            k=o*10+oo;
            System.out.print(k);
            if(((k>=65)&&(k<=90))||((k>=97)&&(k<100)))
            {
                g=(char)k;
                System.out.print(g);
                k=0;
            }
            else if((k>=100)&&(k<=122))
            {
                k=(k*10)+((int)n.charAt(i+2));
                i++;
                g=(char)k;
                System.out.print(g);
                k=0;
            }
            else if(k==32)
            {
                 g=(char)k;
                 System.out.print(g);
                 k=0;
            }
            else
            {
                continue;
              }
           
    }
}
}