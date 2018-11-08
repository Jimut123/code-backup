class l
{
    int check(int m,int n)
    {
        if(n==1)
        return -m--;
        else
        return ++m+check(m,--n);
    }
}