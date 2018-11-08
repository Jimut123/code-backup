import java.io.*;
class Display1
{
    void main()
    {
        int n=21,c=0;
        do
        {
            if(n%2==0)
            {
                System.out.print(n+" ");
                c++;
            }
            n++;
        }
        while(c<11);
    }
}