class moneh
{
    void getSum(int n)
    {
        int m=0;
        m=n/1000;
        System.out.println(" 1000x"+m);
        n=n-m*1000;
        m=n/500;
        System.out.println(" 500x"+m);
        n=n-m*500;
        m=n/100;
        System.out.println(" 100x"+m);
        n=n-m*100;
        m=n/50;
        System.out.println(" 50x"+m);
        n=n-m*50;
        m=n/20;
        System.out.println(" 20x"+m);
        n=n-m*20;
        m=n/10;
        System.out.println(" 10x"+m);
        n=n-m*10;
        m=n/5;
        System.out.println(" 5x"+m);
        n=n-m*5;
        m=n/2;
        System.out.println(" 2x"+m);
        n=n-m*2;
        m=n/1;
        System.out.println(" 1x"+m);
        n=n-m*1;
    }
}
