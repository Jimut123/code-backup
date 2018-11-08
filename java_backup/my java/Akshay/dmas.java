import java.util.*;
class dmas
{
    Scanner sc=new Scanner(System.in);
    char a[]={'-','+','*','/'};
    String s;
    int result;
    void Input()
    {
        System.out.println("Enter any expression : ");
        s=sc.next();
    }
    void calc()
    {
        String temp="";
        temp=s;
        int k=0;
        for(int j=3;j>=0;j--)
        {
            for(int i=0;i<s.length();i++)
            {   int a1,a2;
                if(s.charAt(i)==a[j])
                {   int m=i,z=3;
                    while(m>=0)
                    {
                        while(z>=0)
                        {
                            if(s.charAt(m)==s[z])
                            {
                                a1=s.charAt(m)+a1;
                                i--;
                            }
                            else
                            {
                                f==1;
                                break;
                            }
                        }
                        if(f==1)
                            break;
                            else
                            i--;
                    }
                     while(m>=0)
                    {
                        while(z>=0)
                        {
                            if(s.charAt(m)==s[z])
                            {
                                a2=s.charAt(m)+a2;
                                i--;
                            }
                            else
                            {
                                f==1;
                                break;
                            }
                        }
                        if(f==1)
                            break;
                            else
                            i--;
                    }       
                    
                    if(j==3)
                        k=a1/a2;
                    else if(j==2)
                        k=a1*a2;
                    else if(j==1)
                        k=a1+a2;
                    else
                        k=a1-a2;
                }
                if(i>1)
                    temp=s.substring(0,i-1)+k+s.substring(i+2);
                else
                    temp=k+s.substring(0,i-
            }
        }
        result=k;
    }
    void display()
    {
        System.out.println("Result : "+result);
    }
}
