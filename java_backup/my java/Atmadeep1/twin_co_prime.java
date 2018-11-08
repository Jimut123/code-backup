import java.io.*;
class twin_co_prime
{
  int k,k1,n,n1,n2,i;
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
  void input()throws IOException
  {
    
    System.out.println(":-------ENTER THE NUMBER-------:");
    n=Integer.parseInt(input.readLine());
    n1=n;
    while(n1>0)
    {
        k=n1%10;
        if(primecheck(k)==0)
        {
            n2=n1/10;
            while(n2>0)
            {
                k1=n2%10;
                if(primecheck(k1)==0)
        {
            if((k-k1)==2||(k-k1)==-2)
            System.out.println(k+","+k1);
        }
        n2=n2/10;
    }
}
n1=n1/10;
    }
    n1=n;
    while(n1>10)
    {
        k=n1%10;
        if(primecheck(k)==0)
        {
            n2=n1/10;
            while(n2>0)
            {
               k1=n2%10;
               if(primecheck(k1)==0)
        {
            if((primecheck(k+k1))==0||(primecheck(k-k1)==0))
             System.out.println(k+","+k1);
        }
        n2=n2/10;
    }
}
n1=n1/10;
    }
    }
    
    int primecheck(int x)
    {
        int f=0;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
            {
            f=1;
            break;
            }
        }
        return f;
    }
    
}    

