import java.io.*;
class print
{
    int i;
    void print1()
    {
       System.out.println("Jimut");
    }
    void print2(int n)
    {
       for(int i=1;i<=10;i++)
       {
           System.out.println( );
        }
    }
    void print3(int n1)
    {
        for(i=1;i<n1;i++)
        {
            print1();
        }
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        print ob = new print();
        System.out.println("Enter the number of ten times you want to print:");
        int top = Integer.parseInt(cd.readLine());
        ob.print3(top);
    }
}