import java.io.*;
public class kith
{
    public static void main()throws IOException
        {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c,f=0,k=0,n1=0,s=0,i,p;
        System.out.println("Enter no. ");
        n=Integer.parseInt(br.readLine());
        n1=n;
        c=0;
        int a[]=new int[n];
        s=0;
        f=0;
        p=0;
        while(n1>0)
        {
            c=(c*10)+n1%10;
            f++;
            n1=n1/10;
            
        }
        k=0;
        while(c>0)
        {
          a[k]=c%10;
          k++;
          c=c/10;
        }
         //System.out.println(f);
        for(i=0;i<k;i++)
        System.out.println(a[i]);
        int t=0;
        int t1=0;
        
        for(i=0;;i++)
        {
          t1=i;
          System.out.println(f);
            while(t<=f)
          {
            s=s+a[t1];
            t1++;
          t++;
        }
         System.out.println(t);
          System.out.println(s);
              if(s==n)
            {
                p=1;
                break;
            }
            else
             if(s>n)
             {
                 p=0;
                 break;
                }
                a[t1+1]=s;
               
                s=0;
                t=0;
                
            
        }
       if(p==1)
       System.out.println("keith"+n);
       else
       System.out.println("Non keith"+n);
            
            
    }
}