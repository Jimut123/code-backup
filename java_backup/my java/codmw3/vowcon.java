
import java.util.*;
public class vowcon
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int b,d=0,e,i,g,k;
        char c;
        System.out.println("Enter word");
        a=sc.nextLine();
        e=(int)'a';
        g=(int)'z';
        for(b=0;b<a.length();b=b+1)
        {
            c=a.charAt(b);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                d=(int)c;
                d++;
                c=(char)d;
                System.out.print(c);
            }
            else if(c==' ')
            {
                System.out.print(" ");
            }
            else 
            {
                i=2;
                d=(int)c;
                for(k=0;k<=i;k++)
                {
                    d++;
                    if(d>=g)
                    {
                        d=e;
                    }
                    c=(char)d;
                    if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')
                    {
                        c=(char)d;
                        System.out.print(c);
                        break;
                    }
                    i++;
                }
            }
        }
    }
}
                    
                    
                    
            
        
        