import java.io.*;
class Student
{
    String name;
    int roll;
    char sec;
    void input()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\nEnter the name: ");
        name = cd.readLine();
        System.out.println("\nEnter the roll: ");
        roll = Integer.parseInt(cd.readLine());
        System.out.println("\nEnter the Sec: ");
        sec = (char) cd.read();
    }
    void show()throws IOException
    {
        System.out.println("\nThe name: "+name);
        System.out.println("\nThe roll: "+roll);
        System.out.println("\nThe sec: "+sec);
    }
}
