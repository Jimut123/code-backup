package file_operation;
import java.util.*;
import java.io.*;
class stu_file
{
    String name="";
    int roll=0;
    int marks1=0;
    int marks2=0;
    int marks3=0;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileWriter fout=new FileWriter("Students.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        Scanner sc=new Scanner(System.in);
        int ch=0;
        int avg=0;
        do
        {
            System.out.print("Enter a name :- ");
            pout.println("Name "+br.readLine()+" ");
            System.out.print("Enter marks1 :- ");
            marks1=sc.nextInt();
            pout.println("Marks1 "+marks1+" ");
            System.out.print("Enter marks2 :- ");
            marks2=sc.nextInt();
            pout.println("Marks2 "+marks2+" ");
            System.out.print("Enter marks3 :- ");
            marks3=sc.nextInt();
            pout.println("Marks3 "+marks3+" ");
            avg=(marks1+marks2+marks3)/3;
            pout.println("Average "+avg);
            System.out.print("Enter 1 to exit or any other number to continue");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=1);
        pout.close();
    }
    void sort()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("Students.txt");
        BufferedReader br=new BufferedReader(fr);
        while((br.readLine())!=null)
        {
            System.out.println("Name "+br.readLine());
            System.out.println("Marks1 "+sc.nextInt());
            System.out.println("Marks2 "+sc.nextInt());
            System.out.println("Marks3 "+sc.nextInt());
            if(sc.nextInt()>80)
             System.out.print("Average above 80% ");
            System.out.println("Average "+sc.nextInt());
        }
        br.close();
    }
}
            
        
        
        
        