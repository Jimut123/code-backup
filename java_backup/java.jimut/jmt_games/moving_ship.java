
import java.io.*;
class moving_ship
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,j,c;
        String s = "|_||_|";
         System.out.println("Enter [1] for left ,[2] for right,[3] for up,[4] for down,[0] to terminate.");
             for(i=0;i < 2000000000;i++)
        {
            
        }
       
         System.out.print("\f");
         c = Integer.parseInt(cd.readLine());
         while(c!=0)
         {
         if(c==1)
         {
             
                  for(i=0;i <=4;i++)
        {
            
          System.out.print("\t");  
        
        }
             
         System.out.print(s);
         
        }
    }
        
          
}
}