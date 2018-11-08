// class to accept name and marks and calc avg
import java.io.*;
class Files
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of entries");
        int n=Integer.parseInt(br.readLine());
        try{									 
            PrintStream p = new PrintStream(new FileOutputStream("names.txt"));
            System.out.println("Enter names");
            for(int i=0;i<n;i++)
            p.println(br.readLine());
            p.close();  
            p = new PrintStream(new FileOutputStream("marks.txt"));
            System.out.println("Enter marks");
            for(int i=0;i<n;i++)
            p.println(br.readLine());
            p.close();  }
        catch(Exception e)
        {   System.out.println("Error in writing to file : "+e.getMessage());   }
        double s=0;
        try{									 
            DataInputStream name=new DataInputStream(new FileInputStream("names.txt"));
            DataInputStream mark=new DataInputStream(new FileInputStream("marks.txt"));
            System.out.println("Name            marks");
            for(int i=0;i<n;i++)
            {
                double k=Double.parseDouble(mark.readLine());				
                s+=k;
                System.out.println(name.readLine()+"          "+k);
            }   
            System.out.println("Average marks = "+(s/n));
        }
        catch(Exception e)
        {   System.out.println("Error in reading from file : "+e.getMessage());   }
    }
}
