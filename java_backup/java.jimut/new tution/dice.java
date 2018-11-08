import java.io.*;
class dice
 {
     public static void main(String args[])throws IOException
     {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader (ab);
         int count1=0,count2=0,s1=0,s2=0;
         
         while(s1<=20)
         {
             System.out.println("ENTER VALUE ON DICE FOR FIRST PLAYER:");
             s1 = Integer.parseInt(cd.readLine());
             count1=count1+1;
            }
         while(s2<=20)
         {
             System.out.println("ENTER THE VALUE ON DICE FOR SECOND PLAYER:");
             s2 = Integer.parseInt(cd.readLine());
             count2=count2+1;
             
            }
            if(count1>count2)
            {
                System.out.println("PLAYER2 IS THE WINNER:");
        }
        else
         System.out.println("PLAYER1 IS THE WINNER:");
    }
}
          

         
         
         