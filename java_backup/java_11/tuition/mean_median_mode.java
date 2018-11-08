import java.io.*;
class mean_median_mode
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,ch,s=0,c=0,j=0,o,k,n,m,d,q,w,e=0,t,ll,col=0,min,p1,c2=0,max=0,y=0;
        float p,med;
        System.out.println("Enter the set:");
        k = Integer.parseInt(cd.readLine());
        p1=k;
        int l[]=new int[k];
        System.out.println("Enter the numbers of the set:");
        for(i=0;i<k;i++)
        {
            l[i]=Integer.parseInt(cd.readLine());
        }
        System.out.println("Enter your choice:-[1] for mean, [2] for median, [3] for mode:");
        ch = Integer.parseInt(cd.readLine());
        switch (ch)
        {
            case 1:
            {
                for(i=0;i<k;i++)
                {
                    s=s+l[i];
                    c++;
                }
                p=s/c;
                q=(int)p;
                 while(q!=0)
                {
                    w=q%10;
                    e=e+1;
                    q=q/10;
                }
                    n=s;
                    d=c;
        while(n!=0)
        {
            if(n<10)
            {
             m=n*10;
             s=m/d;
             n=n*10;
             n=n%d;
             System.out.print(s);
            }
            else
            {
               m=n/d;
               n=n%d;
              System.out.print(m);
            }
            j++;
            if(j>=100)
            {
                n=0;
            }
            if(j==e)
            {
                System.out.print('.');
            }
        }
       
            }
            break;
            case 2:
            {
                  for(i=0;i<(k-1);i++)
           {
            min=i;
            for(j=(i+1);j<k;j++)
            {
                if(l[j]<l[min])
                {
                   min=j;
                }
            }
                t=l[i];
                l[i]=l[min];
                l[min]=t;
            }
               
                if(k%2!=0)
                {
                     ll=(p1+1)/2;
                     med = l[ll-1];
                     System.out.println("Median="+med);
                }
                else
                {
                     ll=(k-1)/2;
                     col = col+l[ll];
                     ll = l[ll+1];
                     col = col+ll;
                     med = (float)col/2;
                    System.out.println("Median:"+med);
        }
                }
            
            break;
            case 3:
            {
                for(i=0;i<k;i++)
                {
                    for(j=0;j<k;j++)
                    {
                        if(l[i]==l[j])
                        {
                            c2++;
                            if(c2>max)
                            {
                                max=c2;
                                y=i;
                            }
                            
                        }
                    }
                    c2=0;
            }
            System.out.println(l[y]);
        }
            break;
            default:System.out.println("Wrong Choice:");
        }
    }
}
