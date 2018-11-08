import java.util.*;
public class hexas
{
    Scanner sc=new Scanner(System.in);
    String a,c="",k="";
    int s=0;
    void input()
    {
        System.out.println("Enter the number");
        a=sc.nextLine();
    }
    void start(int b)
    {
        if(b==0)
        {
            c+=a.charAt(b);
            sum(c,0);
            return;
        }
        else
        {
            c+=a.charAt(b);
            if(c.length()==4)
            {
               
                sum(c,0);
                c="";
            }
            start(b-1);
        }
    }
    void sum(String d,int m)
    {
        s+=Integer.parseInt(""+d.charAt(m))*(int)Math.pow(2,m);
        if(m==d.length()-1)
        {
            if(s==10)
            {
                k+='A';
            }
            else if(s==11)
            {
                k+='B';
            }
            else if(s==12)
            {
                k+='C';
            }
            else if(s==13)
            {
                k+='D';
            }
            else if(s==14)
            {
                k+='E';
            }
            else if(s==15)
            {
                k+='F';
            }
            else
            {
            k+=s;
            }
            //System.out.println(k);
            s=0;
            return;
        }
        sum(d,m+1);
    }
    void main()
    {
        input();
        start(a.length()-1);
        System.out.println(k);
    }
}