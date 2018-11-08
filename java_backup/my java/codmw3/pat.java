public class pat
{
    void main()
    {
        int a,b;
        int d=(int)'A';
        for(a=1;a<=25;a++)
        {
            System.out.print((char)d);
            for(b=1;b<=3;b++)
            {
                System.out.print((char)(d+1));
            }
        
        System.out.println((char)d);
        d=d+1;
    }
}
}

            
    