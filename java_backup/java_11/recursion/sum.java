import java.io.*;
class sum
{
    int sum(int n)
    {
        if(n==1)
        return 1;
        else
        return n+sum(n-1);
    }
}