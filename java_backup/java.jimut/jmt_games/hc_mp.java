import java.io.*;
class hc_mp
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
            System.out.println("\f ");
            int l,i,n,c,j,m=2,d=0,s=0,o,t,v=9;
             System.out.println("WILL YOU TAKE ODD[1] OR EVEN[2]: ");
             o = Integer.parseInt(cd.readLine());
     if(o == 1)
            {
             System.out.println("ENTER YOUR TOSS TURN: ");
             t = Integer.parseInt(cd.readLine());
             c =  ((int)(Math.random()*6));
             System.out.println("COMPUTER'S TURN:"+c);
               if((t+c)%2!=0)
                   {
                     System.out.println("YOU WON THE TOSS : ");
                     System.out.println("WANT TO BAT FIRST[1] OR BALL FIRST[2]::");
                     n = Integer.parseInt(cd.readLine());
                   if(n==1)
                       {
                          do
                           {
                         System.out.println("YOU ARE BATTING FIRST ::");
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                         c =  ((int)(Math.random()*6));
                         System.out.println("COMPUTER'S TURN:"+c);
                         s=s+n;
                        
                       if(n==c)
                       {
                         v=0;
                              System.out.println(" YOUR TURN IS OVER.");
            
                              System.out.println("YOUR TOTAL SCORE IS:"+s);
                       }
                    }
                   while(v!=0);
         
                      do
                
                       {
                     System.out.println("YOU ARE BALLING NOW ::");
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                     c =  ((int)(Math.random()*6));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                      d=d+c;
                     if(n==c)
                     {
                         v=0;
                              System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("COMPUTER TOTAL SCORE IS:"+d);
                    System.out.println("YOUR TOTAL SCORE IS:"+s);
                    if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else
                    {
                        System.out.println("YOU WON");
                        
                    }
                   }
                  }
                
             while(v!=0);
            }
            
        
             else if(n==2)
             {
                 s=0;
                 d=0;
                 
                 
                   do
                           {
                         System.out.println("YOU ARE BALLING FIRST ::");
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                         c =  ((int)(Math.random()*6));
                         System.out.println("COMPUTER'S TURN:"+c);
                         d=d+c;
                        
                       if(n==c)
                       {
                         v=0;
                              System.out.println("COMPUTER'S TURN IS OVER.");
            
                              System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                       }
                    }
                   while(v!=0);
         
                      do
                
                       {
                     System.out.println("YOU ARE BATTING NOW ::");
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                     c =  ((int)(Math.random()*6));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                     s=s+n;
                     if(n==c)
                     {
                         v=0;
                              System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("YOUR'S TOTAL SCORE IS:"+s);
                    System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                    if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else
                    {
                        System.out.println("YOU WON");
                        
                    }
                    }
            }
            while(v!=0);
        }
    }
}
}
}



