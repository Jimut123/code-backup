import java.io.*;
class File
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Student.dat")));
        String name;
        String classs;
        String sec;
        String Eng;
        String Phy;
        String Maths;
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the name:");
            name=br.readLine();
            pw.println("Name:"+name);
            
            System.out.println("Enter the class:");
            classs=br.readLine();
            pw.println("Class:"+classs);
            
            System.out.println("Enter the section:");
            sec=br.readLine();
            pw.println("Section:"+sec);
            
            System.out.println("Enter the English Marks");
            Eng=br.readLine();
            pw.println("English Marks:"+Eng);
            
            System.out.println("Enter the Physics Marks");
            Phy=br.readLine();
            pw.println("Physics Marks:"+Phy);
            
            System.out.println("Enter the Maths Marks");
            Maths=br.readLine();
            pw.println("Maths Marks:"+Maths);
        }//End of for
    }//End of main()
}//End of class


        