
public class consequetiveno
{
   
    public static void sampleMethod(int n)
    {
        int k=n;
        int k1=n;
        int c=0;
        while(k>0)
        {
            c=c+1;
            k=k/10;
        }
        int no=k1%10;
        int flag=0;
        for(int i=0;i<c;i++)
        {
            int k2=k1;
  
            while(k2>0)
            {
                int rem=k2%10;
                if(rem==(no+1))
                {
                    flag=flag+1;
                    no=no+1;
                    break;
                }
                else
                k2=k2/10;
            }
            if(flag==0)
            break;
        }
        System.out.print(flag);
        if(flag==(c-1))
        {
            System.out.println("The no is consequetive");
        }
      else
      System.out.println("The no is  not consequetive");
      
       
    }
}
