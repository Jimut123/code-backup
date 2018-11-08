import java.util.*;
public class lucky
{

void main()
{
    Scanner sc=new Scanner(System.in);
    int a,c,d,e,cc,k,m;
    System.out.println("enter limit");
    a=sc.nextInt();
    String b[]=new String[a];
    for(c=0;c<a;c=c+1)
    {
        System.out.println("enter number");
        b[c]=sc.nextLine();
    }
    cc=0;
    d=2;k=0;
    m=1;
    for(c=0;c<m;c=c+1)
    {
        for(e=0;e<a;e=e+1)
        {
            if(b[e].equalsIgnoreCase("null"))
            {
                continue;
            }
            if(cc>=d)
            {
                cc=0;
                b[e]="null";
            }
            cc++;
        }
        for(e=0;e<a;e=e+1)
        {
            if(b[e].equalsIgnoreCase("null"))
            {
                continue;
            }
            else
            {
                k++;
            System.out.print(b[e]+" ");
        }
        }
        System.out.println();
        d++;
        cc=0;
        if(d>=k)
        {
            break;
        }
        else
        {
            m++;
        }
        k=0;
    }
}
}
        
        
        
        