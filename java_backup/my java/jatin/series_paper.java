

class series_paper
    {
        public static void main(int l,int n)
            {
                int i,k,d,p=1,m=0,j;
                double s=0;
                switch(l)
                    {
                        case 1:
                            for(i=1;i<=n;i++)
                                {
                                            j=4;
                                            s=s+((double)1/(double)j);
                                            j=j+4;
                                    }
                                    System.out.print(s);
                                    break;
                        case 2:
                           int k1=1;
                            for(k=1;k<=n;k++)
                                {
                                    p=1;
                                    for(d=1;d<=k;d++)
                                        {
                                            p=p*d;
                                        }
                                    m=m+(d/p)*k1;
                                    k1=k1*-1;
                                }
                                System.out.print(m);
                                break;
                        default :
                        System.out.print("error");
                    }
                }
            }
