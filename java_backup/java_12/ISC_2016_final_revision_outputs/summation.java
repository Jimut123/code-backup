class summation
{
    int sum(int n)
    {
        if(n==1)
        return 1;
        else
        return n+sum(n-1);
    }
}