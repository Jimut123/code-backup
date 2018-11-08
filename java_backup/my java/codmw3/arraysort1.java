import java.util.*;
public class arraysort1
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,hi,c,pos=0,k,m,n,p,q,ii,cc=0,h,l,u;
        System.out.println("Enter limit");
        a=sc.nextInt();
        int b[]=new int[a];
        hi=0;
        for(c=0;c<a;c=c+1)
        {
            System.out.println("Enter number");
            b[c]=sc.nextInt();
            if(b[c]>hi)
            {
                pos=c;
            }
        }
        
        k=b[(a-1)/2];
        b[(a-1)/2]=b[pos];
        b[pos]=b[(a-1)/2];
        p=1;
        q=1;
        ii=b[0];
        for(m=0;m<a;m=m+1)
        {     
            cc=cc+1;
            for(n=0;n<a;n=n+1)
            {
                if(b[n]>ii)
                {
                    if(b[n]==hi)
                    {
                        continue;
                    }
                    h=b[n];
                    pos=n;
                }
            }
            if(cc%2==0)
            {
                if((a/2)-1-p<0)
                {
                    continue;
                }
                l=b[(a/2)-1-p];
                b[(a/2)-1-p]=b[pos];
                b[pos]=l;
                p++;
            }
            else
            {
                l=b[(a/2)-1+q];
                b[(a/2)-1+q]=b[pos];
                b[pos]=l;
            q++;
            }   
        }
        for(u=0;u<a;u=u+1)
        {
            System.out.print( "   "+b[u]);
        }
            }
}