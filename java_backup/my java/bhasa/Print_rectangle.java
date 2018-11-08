import java.io.*;
class Print_rectangle
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    int k,i,j,p,q,r;
    void input()throws IOException
    {
        System.out.println("ENTERE STRING");
        s=br.readLine();
        k=s.length()-1;
        disp();
    }
    

    
    void disp()throws IOException
    {
        System.out.print(s);
        p=1;
        q=s.length()-2;
        r=q;
        System.out.println();
        while(p<=s.length()-2 && q>=1)
        {
            System.out.print(s.charAt(p));
            for(i=1;i<=r;i++)
            System.out.print(" ");
            System.out.print(s.charAt(q));
            p++;
            q--;
            System.out.println();
        }
            for(i=s.length()-1;i>=0;i--)
            {
                System.out.print(s.charAt(i));
            }
        }
    }

