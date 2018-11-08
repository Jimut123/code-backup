import java.io.*;
class stone_paper_scissor
{
 public static void main(String args[])throws IOException
 {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
            System.out.println("\f ");
            int i,c,n,sc=0,sp=0,tsc=0,tsp=0,k,d;
            String j;
           
            String s1,s2,s3;
            s1="stone";
            s2="paper";
            s3="scissors";
            
                System.out.println("\f");
          System.out.println("WELCOME TO STONE_PAPER_SCISSORS...");
               for(i = 1;i<=2;i++ )
          {
              System.out.println();
          }
          for(i = 1;i<=2;i++ )
          {
              System.out.print("\t");
          }
          System.out.println(" CREDITS::           ");
         System.out.println("-------------------------------");
         System.out.println("[-] designed in oracle in java");
         System.out.println("[-] designed by Jimut Bahan Pal");
          for(i = 1;i<=2000000000;i++ )
          {
          }
          
        
         
         System.out.println("\f");
         System.out.println("RULES ARE::- (YOU HAVE 11 SECONDS TO READ)");
         System.out.println("[.] you and computer will play .");
         System.out.println("[.] you have to enter the number of terms you want to play .");
         System.out.println("[.] you have to enter either stone or paper or scissors. ");
         System.out.println("[.] stone dominates over scissors.");
         System.out.println("[.] paper dominates over stone.");
         System.out.println("[.] scissors dominates over  paper.");
         System.out.println("[.] for each dominating turn one point will be awarded.");
         
         for(d=1;d<=4;d++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
        
           
           
            System.out.println("Enter the no. of terms you want to play,generally press[5,10,15,20,25]::");
            n = Integer.parseInt(cd.readLine());
            System.out.println("SCORE BOARD::");
            System.out.println("Player\t\t\t\t\t\tComputer");
             for(i=0;i<n;i++)
             {
                System.out.println("Enter your turn[stone,paper,scissors]::");
                c =  ((int)(Math.random()*3));
                 j = cd.readLine();
                 
                 if((j.equals(s1))&&(c==0))
                 {
                     sc = 0;
                     sp = 0;
                 }
                 else  if((j.equals(s2))&&(c==0))
                 {
                     sc = 0;
                     sp = 1;
                 }
                  else  if((j.equals(s3))&&(c==0))
                 {
                     sc = 1;
                     sp = 0;
                 }
                  else if((j.equals(s1))&&(c==1))
                 {
                     sc = 1;
                     sp = 0;
                 }
                 else  if((j.equals(s2))&&(c==1))
                 {
                     sc = 0;
                     sp = 0;
                 }
                  else  if((j.equals(s3))&&(c==1))
                 {
                     sc = 0;
                     sp = 1;
                 }
                  else if((j.equals(s1))&&(c==2))
                 {
                     sc = 0;
                     sp = 1;
                 }
                 else  if((j.equals(s2))&&(c==2))
                 {
                     sc = 1;
                     sp = 0;
                 }
                  else  if((j.equals(s3))&&(c==2))
                 {
                     sc = 0;
                     sp = 0;
                 }
                 else if((j!=s1)&&(j!=s2)&&(j!=s3))
                 {
                      System.out.println("wrong choice");
                      n++;
                    }
                 
                 if((j.equals(s1))&&(c==0))
                 {
                     System.out.println(s1+"\t\t\t\t\t\t"+s1);
                 }
                 else  if((j.equals(s2))&&(c==0))
                 {
                     System.out.println(s2+"\t\t\t\t\t\t"+s1);
                 }
                  else  if((j.equals(s3))&&(c==0))
                 {
                    System.out.println(s3+"\t\t\t\t\t\t"+s1);
                 }
                  else if((j.equals(s1))&&(c==1))
                 {
                     System.out.println(s1+"\t\t\t\t\t\t"+s2);
                 }
                 else  if((j.equals(s2))&&(c==1))
                 {
                     System.out.println(s2+"\t\t\t\t\t\t"+s2);
                 }
                  else  if((j.equals(s3))&&(c==1))
                 {
                    System.out.println(s3+"\t\t\t\t\t\t"+s2);
                 }
                  else if((j.equals(s1))&&(c==2))
                 {
                    System.out.println(s1+"\t\t\t\t\t\t"+s3);
                 }
                 else  if((j.equals(s2))&&(c==2))
                 {
                     System.out.println(s2+"\t\t\t\t\t\t"+s3);
                 }
                  else  if((j.equals(s3))&&(c==2))
                 {
                      System.out.println(s3+"\t\t\t\t\t\t"+s3);
                 }
                  else if((j!=s1)&&(j!=s2)&&(j!=s3))
                 {
                      System.out.println("wrong choice");
                      n++;
                    }
                 tsc=tsc+sc;
                 tsp=tsp+sp;
                }
               
                System.out.println("Total score of computer is: "+tsc+" and player is: "+tsp);
                if(tsc>tsp)
                {
                System.out.println("COMPUTER WON");
                }
                else if(tsc<tsp)
                {
                    System.out.println("YOU WON");
                }
        
          System.out.println("THANKS FOR PLAYING.");
    

}
}
