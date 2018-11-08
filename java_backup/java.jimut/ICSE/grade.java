import java.io.*;
class grade
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String name;
        System.out.println("Enter your name:");
        name = cd.readLine();
        int sub[]=new int[7];
        int i,m=0;
        char grade;
        for(i=0;i<7;i++)
        {
             System.out.println("Enter your marks:");
             sub[i]=Integer.parseInt(cd.readLine());
             m=m+sub[i];
        }
        double per = (m/700.0)*100.0;
        System.out.println("Your name : "+ name+" and your percentage : "+ per);
        if(per>=85.0)
        {
            grade = 'A';
        }
        else if((per>=70.0)&&(per<=85.0))
        {
            grade = 'B';
        }
        else if((per>=55.0)&&(per<=70.0))
        {
            grade = 'C';
        }
         else if((per>=40.0)&&(per<=55.0))
        {
            grade = 'D';
        }
        else
        {
            grade = 'e';
            
        }
        System.out.println("Your Grade:"+grade);
    }
}
            