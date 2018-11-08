class prm
{
    public static void main(String args[])
    {
    int c=1,p=0,a;
    System.out.println("\f");
    while(c<=1000000)
    {
        a=(int)(Math.random()*1000);
        p=0;
        if(a>=100 && a<=999)
        {
            for(int j=2;j<a;j++)
            {
                if(a%j==0)
                {
                    p++;
                }
            }
            if(p==0)
              System.out.println(a);
        }
        c++;
    }
}
}