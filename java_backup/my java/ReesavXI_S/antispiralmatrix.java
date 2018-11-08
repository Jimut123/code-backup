import java.util.*;
class antispiralmatrix
{
public static void main(int n)
{
Scanner sc=new Scanner(System.in);
int r=n*n;
int t,i,j,k,lm,hm;
int a[][]=new int[n][n];
t=1;
      for(i=0;i<n;i++)
      {
          j=0;
          a[j][i]=t;
          t++;
        }
        int na,i1,j1,r2,hm1;
        na=r-n;
        lm=1;
        hm=n-1;
        r2=0;
        
        
       while(t<=r)
       {
        
      hm1=hm-1;
           for(j=lm;j<=hm;j++)
           {
              i=hm;
              a[j][i]=t;
              t++;
                             
            }
            
               for(i=hm1;i>=lm-1;i--)
               {
                j=hm;
                a[j][i]=t;
                t++;
                    }
                    r2=r2+1;
                    if(r2==1)
                    {
                        for(j=hm1;j>=lm;j--)
                        {
                            i=lm-1;
                            a[j][i]=t;
                            t++;
                        }
                        for(i=lm;i<hm;i++)
                        {
                            j=lm;
                            a[j][i]=t;
                            t++;
                        }
                        r2=0;
                        lm++;
                        hm--;
                         
                }  
                
                if(lm>hm)
                break;
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
