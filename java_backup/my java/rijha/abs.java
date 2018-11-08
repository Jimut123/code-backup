abstract class abs

{
    abstract void cal();
    
   
    int sum(int n)
    {
        int i,s,a;s=0;i=0;a=0;
        for(i=n;i>0;i=i/10)
        {
            a=i%10;
            s=s+a;
        }
        return s;
    }
}

