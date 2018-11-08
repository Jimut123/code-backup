class time
{
    void getTime(int h1,int m1, int s1, int h2, int m2, int s2)
    {
        int t1=h1*3600+m1*60+s1;
        int t2=h2*3600+m2*60+s2;
        int d=0;
        if(t2>t1)
        d=t2-t1;
        else
        d=t1-t2;
        int h=d/3600;
        d=d-h*3600;
        int m=d/60;
        d=d-m*60;
        System.out.println("Time Difference : "+h+" hr "+m+" min "+d+" sec.");
    }
}