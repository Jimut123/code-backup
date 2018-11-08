import java.io.*;
public class permutation
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s1=0;String n;
        int s2=0;int i;
        int a=1;int k;
        int b=1;int c=0;
        int x1=0;char arr[];
        int x2=0;int l;
        int x3;
        int j,t;
    void input(String args[])throws IOException
    {
        System.out.println("give string/number");
        n=br.readLine();
        calc();
    }
    int fact()
        {
           for(i=1;i<=l;i++)
            {
                a=a*i;
                s1=s1+a;
            }
             
           
            return s1;
        }
    void calc()
    {
        l=n.length();
        //l=l+1;
        arr=new char[l+1];
        t=1;
        for(i=0;i<l;i++)
        {
            arr[t]=n.charAt(i);
            t=t+1;
        }
        int z= fact();
        //System.out.println(z);
        for(i=1;i<=l;i++)
        x1=(x1*10)+i;
        //System.out.println(x1);
        for(i=l;i>=1;i--)
        x2=(x2*10)+i;
        System.out.println("Permutations are:");
        for(i=x2;i>=x1;i--)
        {
            s2=0;
            //b=1;
            x3=i;
            while(x3>0)
            {
                k=x3%10;
                if(k>0)
                {
                b=1;
                for(j=1;j<=k;j++)
                b=b*j;
                s2=s2+b;
            }
                x3=x3/10;
            }
            //System.out.println(s2);
            if(z==s2)
            {
              x3=i;
               while(x3>0)
               {
                   k=x3%10;
               if(k>0)
                    System.out.print(arr[k]);
                    x3=x3/10;
                }
                c++;
                 System.out.println("");
                }
                
            }
        
        System.out.println("total nunber of permutations:"+c);
    }
}
        
                   
            
        
        