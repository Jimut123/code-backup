class output
{
    public void numbers(int n)
    {
        if(n>0)
        {
            System.out.print(n);
            numbers(n-2);
             System.out.print(n);
            }
        }
    }
            