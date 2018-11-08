class power
{
    int pow(int n,int m)
    {
        if(m==0)
        return 1;
        else
        return n*pow(n,m-1);
    }
}