import java.io.*;
class Marks extends Student
{
    int m1,m2,m3;
    void input()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        super.input();
        System.out.println("\nEnter the marks of sub 1: ");
        m1 = Integer.parseInt(cd.readLine());
        System.out.println("\nEnter the marks of sub 2: ");
        m2 = Integer.parseInt(cd.readLine());
        System.out.println("\nEnter the marks of sub 3: ");
        m3 = Integer.parseInt(cd.readLine());
    }
    void show()throws IOException
    {
        super.show();
        System.out.println("\nThe marks of sub 1: "+m1);
        System.out.println("\nThe marks of sub 2: "+m2);
        System.out.println("\nThe marks of sub 3: "+m3);
    }
}
