import java.io.*;
class pow
{
    int pow(int n,int m)
    {
        if(n==1)
        return m;
        else
        return m*pow((n-1),m);
    }
}