
import java.io.*;
class hand_cricket_computer
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
         int i,j,c,k,m=2,n,sp=0,sc=0;
         System.out.println("WELCOME TO HAND-CRICKET...");
         for(i=0;i<=3;i++)
         {
              System.out.print("\t");
              
         }
         for(i=0;i<=3;i++)
         {
             System.out.println();
              
         }
          System.out.println(".......................CREDITS");
         System.out.println("                       -------");
         System.out.println("[-] designed in oracle in java");
         System.out.println("[-] designed by Jimut Bahan Pal");
          for(i = 1;i<=2000000000;i++ )
          {
          }
           System.out.println("\f");
         System.out.println("RULES ARE::-");
         System.out.println("[.] you have to enter a number ranging from 0 to 6.");
         System.out.println("[.] computer and your score will be shown together for short time.");
         System.out.println("[.] either you will ball or you will bat. ");
         System.out.println("[.] you have to take either odd or even.");
         System.out.println("[.] the one wins the toss whose total matches.");
         System.out.println("[.] the one wins whose batting's sum is greater.");
         System.out.println("[.] computer and player could play.");
         System.out.println("[.] player and player could play.");
         for(j=1;j<=3;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
         System.out.println("ENTER MODE::-");
         System.out.println("Enter [1] for computer and player.");
         System.out.println("Enter [2] for player and player .");
         c = Integer.parseInt(cd.readLine());
         
        System.out.println("\f");
         if(c == 1)
         {
            
                 System.out.println(" IF YOU TAKE ODD PRESS[1] IF EVEN[2]:");
                 n = Integer.parseInt(cd.readLine());
                 if(n == 1)
                 {
                 System.out.println(" Enter your  turn::");
                 n = Integer.parseInt(cd.readLine());
                 c =  ((int)(Math.random()*6));
                 System.out.println(" computer's turn::"+c);
               
        
             for(i = 1;i<=2000000000;i++ )
               {
                }
        
                 
                 System.out.println("\f");
                 if((c+n)%2==1)
                 {
                     System.out.println("Its odd.");
                     System.out.println("\f");
                     System.out.println("Want to bat[6] or ball[7]:");
                     n = Integer.parseInt(cd.readLine());
                     if(n == 6)
                     {
                          for(k=1;k<=m;k++)
             {
                         
                         System.out.println("ENTER YOUR BATTING TURN:");
                         n =  Integer.parseInt(cd.readLine());
                         c =  ((int)(Math.random()*6));
                         System.out.println("COMPUTER'S TURN: "+c);
                         for(j=1;j<=2;j++)
                 {
                  for(i = 1;i<=2000000000;i++ )
                {
                }
                }
                System.out.println("\f");
                         sc = sc+c;
                         sp = sp+n;
                         if(c == n)
                         {
                             System.out.println("PLAYER OUT. ");
                             break;
                             
                            }
                         else
                         {
                             m =m+1;
                             
                            }
                        }
                    }
                }
            }
        }
    }
}
                