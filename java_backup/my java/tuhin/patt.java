
public class patt extends dbllink1
{
   
    public static   void patt(int n)
    {
        
        int l=n-1;
        int k=1;
        for(int i=1;i<=n;i++)
        {
            k=i;
            for(int g=1;g<=l;g++)
            System.out.print(" ");
            l--;
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
            }
            for(int m=k-2;m>=i;m--)
            {
                System.out.print(m);
                
            }
            System.out.println();
            
      
    }

}}