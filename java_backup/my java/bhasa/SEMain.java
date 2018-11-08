//Eligibility check program Main
import java.io.*;
import java.util.*;
class SEMain
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the Student: ");
        String name=br.readLine();
        System.out.println("Enter his/her roll number: ");
        String rollNo=br.readLine();
        System.out.println("Enter marks of any 4 subjects: ");
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int mark4=sc.nextInt();
        System.out.println("Enter his/her extra-curricular grade: ");
        char grade=(char)System.in.read();
        System.out.println("Enter his/her reservation(true/false): ");
        boolean reservation=sc.nextBoolean();
        Eligibility obj=new Eligibility(name, rollNo, mark1, mark2, mark3, mark4, grade, reservation);
        obj.checkEligibility();
        obj.show();
    }
}