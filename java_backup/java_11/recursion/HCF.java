import java.io.*;
class HCF
{
    int hcf(int n,int m)
    {
        if(n==0)
        return m;
        else
        return hcf(m%n,n);
    }
}