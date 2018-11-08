 
import java.io.*;
class Digit
{
    String s,w;
    int c,k,i,p,m,num,count,n1,s1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
    System.out.println("Enter number");
    s=br.readLine();
    System.out.println("Enter checking number");
    num=Integer.parseInt(br.readLine());
    s1=0;
    for(i=0;i<s.length();i++)
    {
        w=" ";
        w=w+s.charAt(i);
        s1=s1+Integer.parseInt(w);
    }
    if(s1==num)
    {
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+",");
        }
    }    
        else
        {
            c=0;
            w=" ";
            for(i=0;i<s.length();i++);
            {
                if(s.charAt(i)=='0'&&c==1)
                {
                    System.out.println("0"+",");
                    c=0;
                }
                else
                {
                    if(c==1)
                    {
                        c=0;
                        w=w+s.charAt(i);
                        k=Integer.parseInt(w);
                    }
                    if(k>num)
                    {
                        p=k/10;
                        if((num-(p+(k%10)))>(num/2))
                        {
                            System.out.print(p+",");
                            num=num-p;
                            w=" ";
                            w=w+s.charAt(i);
                        }
                        else
                        if(p==(num/2))
                        {
                            System.out.print(p+",");
                            num=num-p;
                            w=" ";
                            w=w+s.charAt(i);
                        }
                        else
                        if((num-(p+(k%10)))==(num/2))
                        {
                            System.out.print(p+",");
                            num=num-p;
                            w=" ";
                            w=w+s.charAt(i);
                        }
                        else
                        {
                            System.out.print(p+",");
                            System.out.print(k%10+",");
                            num=num-(p+(k%10));
                            w=" ";
                        }
                        c=1;
                    }
                    else
                    if(k==num)
                    {
                        System.out.print(k+",");
                        w=" ";
                        c=1;
                    }
                }
            }
        }
    }
 public void main()throws IOException
 {
     input();
 }
}

                            
            

