import java.io.*;
class falseloop_1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        long i;
        int n;
        
            System.out.println(":::::::This is the 1st loop,lets start the game..::::::");
            for(i=0;i < 2000000000;i++)
        {
            
        }
         System.out.print("\f");
        System.out.println("Identify the number");
        for(i=0;i < 2000000000;i++)
        {
            
        }
         System.out.print("\f");
         System.out.println("12122");
        for(i=0;i < 99999999;i++)
        {
            
        }
         System.out.print("\f");
         System.out.println("Enter the number which was shown::");
         n = Integer.parseInt(cd.readLine());
         if(n == 12122)
         {
             System.out.println("you won.");
    }
    else 
       {
             System.out.println("you loose.");
    }
}
}

