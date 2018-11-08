package Apc;
import java.io.*;
class student
{
       String name;
       int age,m1,m2,m3,max;
       double average=0.0;
       student(String n,int a,int b,int c,int d)
       {
           name=n;
           m1=a;
           m2=b;
           m3=c;
           age =d;
        }
        void compute()
        {
            average =(double)(m1+m2+m3)/3;
            if((m1>m2)&&(m1>m3))
            {
                max=m1;
            }
            else if((m2>m1)&&(m2>m3))
            {
                max =m2;
            }
            else if((m3>m1)&&(m3>m2))
            {
                max= m3;
            }
        }
        void display()
        {
            System.out.println("Name = "+name);
            System.out.println("Age = "+age);
            System.out.println("Marks in three subjects are : "+m1+","+m2+","+m3);
            System.out.println("Maximum marks = "+max);
            System.out.println("Average = "+average);
              }
        
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the details:");
        System.out.println("Enter the name:");
        String n5 = cd.readLine();
        System.out.println("Enter the age:");
        int age1 = Integer.parseInt(cd.readLine());
        System.out.println("Enter the marks in three subjects::");
        int p= Integer.parseInt(cd.readLine());
        int q= Integer.parseInt(cd.readLine());
        int  r= Integer.parseInt(cd.readLine());
        student ob = new student(n5,p,q,r,age1);
        ob.compute();
        ob.display();
    } 
}