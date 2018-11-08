package Inheritence;

import java.io.*;

public class area implements area1
{
    double r,a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public area()
    {
        // initialise instance variables
        r=0 ;
    }

    void input()throws IOException
    {
       System.out.println("Enter data:");
       r=Double.parseDouble(br.readLine());
    }
    public  void cal()
    {
        a=pi*r*r;
        System.out.println(a);
    }
}
