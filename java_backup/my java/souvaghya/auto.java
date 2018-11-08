class auto
{
    public static void main(String args[])
    {
        int i,k,m,s,s1,s2,f,m1;
        for(i=1;i<=1000;i++)
        {
            k=i;
            m=k*k;
            s1=m;
            s=0;
            while(m>0)
            {
                s++;
                m=m/10;
            }
                
            s2=(int)Math.pow(10,s-1);
            if(s1%s2==i)
              System.out.println(i+"automorphic");
                           }
        }
    }

                   