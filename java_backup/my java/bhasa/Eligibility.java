//Class to check eligibility of Student inherited from class Student
class Eligibility extends Student
{
    private char grade;
    private boolean reservation;
    private float avg;
    public Eligibility(String n, String r, float m1, float m2, float m3, float m4, char grde, boolean reser)
    {
        super(n,r,m1,m2,m3,m4);
        grade=grde;
        reservation=reser;
    }
    public boolean checkEligibility()
    {
        avg=(mark1+mark2+mark3+mark4)/4;
        if(avg>90 && (grade=='A' || grade=='B'))
            return true;
        else if(avg>85 && reservation==true)
            return true;
        else
            return false;
    }
    public void show()
    {
        super.show();
        System.out.println("Average marks: "+avg+"\nExtra-Curricular grade: "+grade+"\nReservation: "+reservation);
        if(checkEligibility()==true)
            System.out.println(name+" is eligible for the course.");
        else
            System.out.println(name+" is not eligible for the course.");
    }
}