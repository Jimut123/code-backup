import java.io.*;
class Grade extends Marks
{
    //String name;
    long avg;
    char grade;
    void calc()throws IOException
    {
        super.input();
        avg = (m1+m2+m3)/3;
        if (avg > 90)
            grade = 'A';
        else if (avg > 75)
            grade = 'B';
        else
            grade = 'C';
        
    }
    void show()throws IOException
    {
        super.show();
     
        
        System.out.println("\nThe avg: "+avg);
        System.out.println("\nThe grade: "+grade);
    
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        Grade ob = new Grade();
        ob.calc();
        ob.show();
       
    }
    
}
