//this class will show the eligibility of a student
import java.util.*;
class Student
{
    protected int roll;
    protected String name;
    protected double marks1;
    protected double marks2;
    protected double marks3;
    protected double marks4;
    protected double avg;
    
    public Student()
    {
        roll=0; name=""; marks1=marks2=marks3=marks4=avg=0.0;
    }
    
    public Student(String n, int r, double m1, double m2, double m3, double m4)
    {
        roll=r;
        name=n; 
        marks1=m1;
        marks2=m2;
        marks3=m3;
        marks4=m4;
        avg=(marks1 + marks2 + marks3 + marks4)/4;
    }
    
    public void show()
    {
        System.out.println("Name: " + name + "\nRoll number: " + roll + "\nMarks in four subjects are as follows:");
        System.out.println("English: " + marks1 + "\nPhysics: " + marks2 + "\nChemistry: " + marks3 + "\nMathematics: " + marks4);
    }
}

class Eligibility extends Student
{
    private char extra;
    private boolean quota;
    
    public Eligibility()
    {
        extra='\u0000';
        quota=false;
    }
    
    public Eligibility(String n, int r, double m1, double m2, double m3, double m4, char e, boolean q)
    {
        super(n, r, m1, m2, m3, m4);
        extra=e;
        quota=q;
    }
    
    public boolean checkEligibility()
    {
        double avg=super.avg;
        if(avg>95) return true;
        else if(avg>90 && (extra=='A'|| extra=='B')) return true;
        else if(avg>85 && quota==true) return true;
        return false;
    }
    
    public void show()
    {
        System.out.println("Student details: ");
        super.show();
        if(checkEligibility()) System.out.println(super.name + " is eligible for the course that he/she has opted for");
        else System.out.println(super.name + " is not eligible for the course that he/she has opted for");
    }
}

public class Student_Eligibility
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's name: ");
        String name=sc.nextLine();
        System.out.print("Enter the student's roll number: ");
        int roll=sc.nextInt();
        System.out.print("Enter " + name + "'s marks in English: ");
        double marks1=sc.nextDouble();
        System.out.print("Enter " + name + "'s marks in Physics: ");
        double marks2=sc.nextDouble();
        System.out.print("Enter " + name + "'s marks in Chemistry: ");
        double marks3=sc.nextDouble();
        System.out.print("Enter " + name + "'s marks in Mathematics: ");
        double marks4=sc.nextDouble();
        System.out.print("Enter " + name + "'s extra co-curricular points: ");
        char extra=sc.next().charAt(0);
        System.out.println("Does " + name + " have a reservation? (Enter T for yes or F for no)");
        boolean b=(sc.next().charAt(0)=='T') ? true : false;
        
        Eligibility s=new Eligibility(name, roll, marks1, marks2, marks3, marks4, extra, b);
        s.show();
    }
}