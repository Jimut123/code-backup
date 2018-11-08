// program to find the roots and its nature of a quadratic equation
import java.io.*;
class FindRoots
{
    private double x1;
    private double x2;
    public void getData()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of a");
        int a=Integer.parseInt(br.readLine());
        System.out.println("enter the value of b");
        int b=Integer.parseInt(br.readLine());
        System.out.println("enter the value of c");
        int c=Integer.parseInt(br.readLine());
        showNature(a,b,c);
    }
    public void showNature (int a,int b,int c)
    {
        double s=Math.pow(b,2)-(4*a*c);
        if (s==0)
        {
            System.out.println("the roots are equal");
            findRoots (a,b,c,s);
        }
        if (s<0)
        System.out.println("the roots are imaginary");
            findRoots (a,b,c,s);
    }
    public void findRoots (int a,int b,int c,double s)
    {
        double y1=(-1)*b+Math.sqrt(s);
        x1=y1/(2*a);
        double y2=(-1)*b-Math.sqrt(s);
        x2=y2/(2*a);
        show();
    }
    public void show()
    {
        System.out.println("the first value of roots"+x1);
        System.out.println("the second value of roots"+x2);
    }
}//end of class
public class MainFindRoots
{
    public static void main(String args[])throws IOException
    {
        FindRoots obj=new FindRoots();
        obj.getData();
    }//end of main()
}//end of main class