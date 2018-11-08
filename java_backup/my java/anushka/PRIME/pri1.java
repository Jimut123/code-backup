package PRIME;
import java.io.*;
public class pri1
{
    int n;int i;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void Input(int x)throws IOException
    {
        n=x;
        i=2;
        if(check(n,i)==true)
        System.out.println(n);
    }
   public boolean check(int n,int i)
    {
        if(n%i==0)
        {
            return false;
        }
        else
        if(i>=n/2)
        {
            return true;
        }
        else
        {
            return (check(n,i+1));
        }
    }
}
        

