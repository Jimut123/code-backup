

public class RangeKrishnamurthynum
{
   public static void main(int n)
   {
       int fact=1,d=0,i,j,m=0,s=0;
       for(i=1;i<=n;i++)
       {
        for(j=i;j>0;j=j/10)
           {
           d=j%10;
            fact=1;
            for(s=1;s<=d;s++)
               {
                   fact=fact*s;
                }
                m=m+fact;
               
            }
               if(m==i)
            System.out.println(i);
        }
    }
}