public class rec
{
    int b[]=new int[7];
    void run()
    {
        int a[]=new int[]{26,23,21,19,17,15,11};
      
        int c=0;
        int d=4;
        int k=0;
        rec1(a,c,k);
        for(int i=0;i<7;i++)
        System.out.print("  "+b[i]);
    }
    void rec1(int g[],int c,int k)
        {
            if((4-k)>6||(4-k)<0)
            return;
            b[4-k]=g[c];
            c++;
            if((c-1)%2==0)
            k++;
            k=k*(-1);
            
            rec1(g,c,k);
        }
    }
          