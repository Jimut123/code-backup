import java.io.*;
class LuckyNum
{
  int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      int i;
      System.out.println("enter no. of elements");
       n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
          System.out.println("enter a no.");
           a[i]=Integer.parseInt(br.readLine());
        }
        lucky(a);
    }
    public void lucky(int a[])
    {
        int k=1,p=2,i,j,m;
        System.out.println("Lucky nos. are :");
        for(i=1;i<=n;i++)
        {
            int t=0;
            for(j=0;j<n;j++)
            {
                
                
                if ((j+1)!=k)
                {
                    a[t]=a[j];
                    t++;
                }
                else
                k=k+p;
                }
                n=t;
                //for(m=0;m<n;m++)
             //System.out.print(a[m]+" ");
                p=p+1;
                k=1;
            if((k+p)>(n-1))
                break;
               // System.out.println("");
            }
            
            for(i=0;i<n;i++)
             System.out.println(a[i]);
            }
        }
    
      
      