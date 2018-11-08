//Accept details of a Student to check eligiblity for a course
import java.util.*;
class Student
{
    protected String name;
    protected String rollNo;
    protected float mark1;      //instance variables
    protected float mark2;
    protected float mark3;
    protected float mark4;
    public Student(String nm, String rlnum, float mrk1, float mrk2, float mrk3, float mrk4)
    {
        name=nm;
        rollNo=rlnum;
        mark1=mrk1;
        mark2=mrk2;
        mark3=mrk3;
        mark4=mrk4;
    }       //end of Student()
    public void show()
    {
        System.out.println("\nName of Student: "+name+"\nRoll Number: "+rollNo+"Marks of 4 subjects: "+mark1+", "+mark2+", "+mark3+", "+mark4);
    }       //end of show()
}       //end of class Student