import java.io.*;
class ABC1 extends ABC
{
    int y;
    ABC1(int x,int y1)
    {
        super(x);
        y=y1;
    }
    void Print()
    {
        super.Print();
        System.out.println("y = "+y);
    }
    public static void main(String args[]) throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        System.out.println("\n Enter x and y : ");
        int a = Integer.parseInt(cd.readLine());
        int b = Integer.parseInt(cd.readLine());
        ABC1 ob = new ABC1(a,b);
        ob.Print();
    }
}