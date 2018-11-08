import java.io.*;
class number
{
    int i,s=0;
    int sumoffactors(int n)
    {
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        return(s);
    }
    boolean isperfect(int n)
    {
        if(sumoffactors(n)==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void perfectnosbelow(int lim)
    {
        for(i=1;i<lim;i++)
        {
            if(isperfect(i) == true)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        number ob = new number();
        System.out.println("Enter the topmost number:");
        int top = Integer.parseInt(cd.readLine());
        ob.perfectnosbelow(top);
    }
}
