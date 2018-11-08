package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
class teacher_specialization
{
    public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         int n,i,d=1;
         String s;
         System.out.println("Enter the number of subject teachers :");
         n = Integer.parseInt(cd.readLine());
         String A[]=new String[n]; 
         String B[]=new String[n]; 
         System.out.println("Enter the teacher's and their respective subject's name :");
         for(i=0;i<n;i++)
         {
             System.out.println("Enter the teacher's name :");
             A[i]=cd.readLine();
             System.out.println("Enter the  subject's name :");
             B[i]=cd.readLine();
         }
         System.out.println("Enter the  subject's name for which you want to search the teacher(s) name :");
         s = cd.readLine();
         for(i=0;i<n;i++)
         {
             if(s.equals(B[i]))
             {
                 System.out.println("Enter the  teacher's name is:"+A[i]);
                 d=0;
             }
         }
         if(d==1)
         {
              System.out.println("Sorry search uncessful, no such subject exists.");
         }
}
}
