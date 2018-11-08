import java.io.*;
public class string
{
        String add(String k,String l)
    {
        int c,m,a1,a2;
        String str,w;
        c=0;
        str="";
        w="";
        for(m=k.length()-1;m>=0;m--)
        {
            if(k.charAt(m)=='1')
            {
                a1=1;
            }
            else 
            {
                a1=0;
            }
            if(l.charAt(m)=='1')
            {
                a2=1;
            }
            else 
            {
                a2=0;
            }
            if(a1+a2+c==0)
            {
                c=0;
                w=w+0;
            }
            else if(a1+a2+c==1)
            {
                c=0;
                w=w+1;
            }
            else if(a1+a2+c==2)
            {
                c=1;
                w=w+0;
            }
            else if(a1+a2+c==3)
            {
                c=1;
                w=w+1;
            }
        }
        w=w+c;
        for(m=w.length()-1;m>=0;m--)
        {
            str=str+w.charAt(m);
        }
        k=str;
        
        return k;
    }
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        String str;
        System.out.println("Enter number of inputs");
        a=Integer.parseInt(br.readLine());
        String s[]=new String[a];
        for(b=0;b<a;b++)
        {
            System.out.println("Enter binary number");
            s[b]=br.readLine();
        }
        if(s[0].length()>s[1].length())
        {
            s[1]=s[1]+spaces(s[0].length()-s[1].length());
        }
        else
        {
            s[0]=s[0]+spaces(s[1].length()-s[0].length());
        }
            str=add(s[1],s[0]);
        for(b=2;b<a;b++)
        {
        
        str=add(str," "+s[b]);
        }
        System.out.println(str);
    }
    String spaces(int a)
    {
        int b;
        String c="";
        for(b=1;b<=a;b++)
        {
            c+=" ";
        }
        return c;
    }
}