package Inheritance;
import java.util.*;
import java.io.*;
class Student3
{
    String name="";
    int roll;
    void input()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name ");
        name=sc.nextLine();
        System.out.print("Enter your roll ");
        roll=sc.nextInt();
    }
}