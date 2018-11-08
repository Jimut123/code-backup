import java.io.*;
class handcricket_game
{
 public static void main(String args[])throws IOException
 {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
            System.out.println("\f ");
            int l,i,n,c,j,m=2,d=0,s=0,o,t,v=9,k,f,g,b=0,x=0,p;
             System.out.println("WELCOME TO HAND-CRICKET...");
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
         System.out.println("[.] you have to enter a number ranging from 0 to 6.");
         System.out.println("[.] computer and your score will be shown together for short time.");
         System.out.println("[.] either you will ball or you will bat. ");
         System.out.println("[.] you have to take either odd or even.");
         System.out.println("[.] the one wins the toss whose total matches.");
         System.out.println("[.] the one wins whose batting's sum is greater.");
         System.out.println("[.] computer and player could play.");
         
         for(j=1;j<=4;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
        
        
        
        
        System.out.println("\f");
             System.out.println("WILL YOU TAKE ODD[1] OR EVEN[2]: ");
             k = Integer.parseInt(cd.readLine());
             System.out.println("\f");
       
  if(k == 1)
            {
             System.out.println("ENTER YOUR TOSS TURN: ");
             t = Integer.parseInt(cd.readLine());
             while(t>6)
             {
                 if(t>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR TOSS TURN: ");
                       t = Integer.parseInt(cd.readLine());
                  
                    }
                }
             c =  ((int)(Math.random()*7));
             System.out.println("COMPUTER'S TURN:"+c);
      
               if((t+c)%2!=0)
                   {
                       System.out.println("\f");
                     System.out.println("YOU WON THE TOSS : ");
                     System.out.println("WANT TO BAT FIRST[1] OR BALL FIRST[2]::");
                     f = Integer.parseInt(cd.readLine());
                     System.out.println("\f");
         
                   if(f==1)
                       {
                           System.out.println("YOU ARE BATTING FIRST ::");
                          do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                          while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         s=s+n;
                        
                       if(n==c)
                       {
                           s=s-n;
                         v=0;
                              System.out.println(" YOUR TURN IS OVER.");
            
                              System.out.println("YOUR TOTAL SCORE IS:"+s);
                       }
                        System.out.println("\t\t\t\t YOUR BATTING'S TOTAL SUM IS::"+s);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
                    }
                   while(v!=0);
                   s=s+1;
                   System.out.println("COMPUTER HAVE TO SCORE MORE THAN ::"+s);
                 System.out.println("YOU ARE BALLING NOW ::");
                 v=9;
                      do
                      {
                     
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                      d=d+c;
                      
                     if((n==c)||(d>=s))
                     {
                         if(n!=c)
                         {
                             d=d+c;
                            }
                         v=0;
                         d=d-c;
                         
                          if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                    else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                     System.out.println(" YOUR TURN IS OVER.");
            
              
                    System.out.println("COMPUTER TOTAL SCORE IS:"+d);
                    System.out.println("YOUR TOTAL SCORE IS:"+s);
                    
                   
                   }
                   System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                    for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
                  }
                  while(v!=0);
            
            
                }
             
        
             else if(f==2)
             {
                 v=9;
                 s=0;
                 d=0;
                 System.out.println("\f");
                 
               
                 System.out.println("YOU ARE BALLING FIRST ::");
                   do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                                   while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         d=d+c;
                        
                       if(n==c)
                       {
                           d=d-c;
                         v=0;
                              System.out.println("COMPUTER'S TURN IS OVER.");
            
                              System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                       }
                         System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
                    }
                   while(v!=0);
                      d=d+1;
                   System.out.println("YOU HAVE TO SCORE MORE THAN ::"+d);
                    System.out.println("YOU ARE BATTING NOW ::");
                     v=9;
                      do
                
                       {
                    
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                     s=s+n;
                     if((n==c)||(s>=d))
                     {
                         v=0;
                         s=s-n;
                          if(n!=c)
                         {
                             s=s+n;
                            }
                              System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("YOUR'S TOTAL SCORE IS:"+s);
                    System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                           if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                    else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                   
                   
                    }
                      System.out.println("\t\t\t\t YOUR BATTING'S TOTAL SUM IS::"+s);
                     for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
            }
            while(v!=0);
           
        }
        else
        {
            System.out.println("SORRY WRONG CHOICE , TRY AGAIN.");
       }
    
    
   }
    
    
    
    else  if((t+c)%2==0)
    {
        System.out.println("\f");
             s=0;
             d=0;
             v=9;    
              System.out.println("YOU ARE BALLING FIRST ::");
                   do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                                   while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         d=d+c;
                        
                       if(n==c)
                       {
                         v=0;
                          d=d-c;    
                       }
                         System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
                    }
                   while(v!=0);
                      d=d+1;
                   System.out.println("YOU HAVE TO SCORE MORE THAN::"+d);
                   System.out.println("COMPUTER'S TURN IS OVER.");
            
                   System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                    System.out.println("YOU ARE BATTING NOW ::");
                  v=9;
                      do
                
                       {
                    
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                     s=s+n;
               if((n==c)||(s>=d))
                {
                    v=0;
                      s=s-n; 
                        if(n!=c)
                         {
                             s=s+n;
                            }
                         System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("YOUR'S TOTAL SCORE IS:"+s);
                        System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                        
                      if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                   else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                   
                    }
                      System.out.println("\t\t\t\t YOUR BATTING'S TOTAL SUM IS::"+s);
                       
                     for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
            }
            while(v!=0);
            
        }
        else
        {
            
        System.out.println("SORRY WRONG CHOICE , TRY AGAIN.");
     }
     
     
    }
      else  if(k == 2)
            {
                System.out.println("\f");
             System.out.println("ENTER YOUR TOSS TURN: ");
             t = Integer.parseInt(cd.readLine());
             c =  ((int)(Math.random()*7));
             System.out.println("COMPUTER'S TURN:"+c);
               if((t+c)%2==0)
                   {
                       System.out.println("\f");
                     System.out.println("YOU WON THE TOSS : ");
                     System.out.println("WANT TO BAT FIRST[1] OR BALL FIRST[2]::");
                     f = Integer.parseInt(cd.readLine());
                   if(f==1)
                       {
                           System.out.println("\f");
                           System.out.println("YOU ARE BATTING FIRST ::");
                           v=9;
                          do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                                   while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         s=s+n;
                        
                       if(n==c)
                       {
                         v=0;
                         s=s-n;
                              System.out.println(" YOUR TURN IS OVER.");
            
                              System.out.println("YOUR TOTAL SCORE IS:"+s);
                       }
                          System.out.println("\t\t\t\t YOUR BATTING'S TOTAL SUM IS::"+s);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
       
                    }
                   while(v!=0);
                      s=s+1;
                   System.out.println("COMPUTER HAVE TO SCORE MORE THAN ::"+s);
                 System.out.println("YOU ARE BALLING NOW ::");
                 v=9;
                      do
                      {
                     
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                      d=d+c;
                     if((n==c)||(d>=s))
                     {
                         v=0;
                         d=d-c;
                          if(n!=c)
                         {
                             d=d+c;
                            }

                              System.out.println(" YOUR TURN IS OVER.");
            
              
                    System.out.println("COMPUTER TOTAL SCORE IS:"+d);
                    System.out.println("YOUR TOTAL SCORE IS:"+s);
                          if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                    else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                   }
                     System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                    for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
        
                  }
                  while(v!=0);
            
            
                }
               
            
            
             
        
             else if( f == 2)
             {
                 v=9;
                 s=0;
                 d=0;
                 System.out.println("\f");
                 
                 System.out.println("COMPUTER IS BATTING FIRST.");
                 System.out.println("YOU ARE BALLING ::");
                   do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                                   while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         d=d+c;
                        
                       if(n==c)
                       {
                           d=d-c;
                         v=0;
                              System.out.println("COMPUTER'S TURN IS OVER.");
            
                              System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                       }
                         System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        
        System.out.println("\f");
                    }
                   while(v!=0);
                      d=d+1;
                   System.out.println("YOU HAVE TO SCORE MORE THAN::"+d);
                    System.out.println("YOU ARE BATTING NOW ::");
                    v=9;
         
                      do
                
                       {
                    
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                     s=s+n;
                     if((n==c)||(s>=d))
                     {
                         v=0;
                         s=s-n;
                          if(n!=c)
                         {
                             s=s+n;
                            }
                              System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("YOUR'S TOTAL SCORE IS:"+s);
                    System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                   
                        if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                    else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                    }
                    System.out.println("\t\t\t\t YOUR'S BATTING'S TOTAL SUM IS::"+s);
                     for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        
        System.out.println("\f");
            }
            while(v!=0);
           
        }
        else
        {
            System.out.println("SORRY WRONG CHOICE , TRY AGAIN.");
       }
    
    
   }
    
    
    
    else  if((t+c)%2!=0)
    {
             s=0;
             d=0;
             v=9;
             System.out.println("\f");
                 
              System.out.println("YOU ARE BALLING FIRST ::");
                   do
                           {
                         
                         System.out.println("ENTER YOUR TURN:");
                         n = Integer.parseInt(cd.readLine());
                                   while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                         c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         d=d+c;
                        
                       if(n==c)
                       {
                         v=0;
                          d=d-c;    
                       }
                       System.out.println("\t\t\t\t COMPUTER'S BATTING'S TOTAL SUM IS::"+d);
                        for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        
        System.out.println("\f");
                    }
                    
                   while(v!=0);
                      d=d+1;
                   System.out.println("YOU HAVE TO SCORE MORE THAN::"+d);
                   System.out.println("COMPUTER'S TURN IS OVER.");
            
                   System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                    System.out.println("YOU ARE BATTING NOW ::");
                    v=9;
         
                      do
                
                       {
                    
                     System.out.println("ENTER YOUR TURN:");
                     n = Integer.parseInt(cd.readLine());
                               while(n>6)
                {
                 if(n>6)
                 {
                       System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                       System.out.println("ENTER YOUR  TURN: ");
                       n = Integer.parseInt(cd.readLine());
                    }
                }
                     c =  ((int)(Math.random()*7));
                     System.out.println("COMPUTER'S TURN:"+c);
                      
                     s=s+n;
               if((n==c)||(s>=d))
                {
                     s=s-n;   
                      if(n!=c)
                         {
                             s=s+n;
                            }
                         System.out.println(" YOUR TURN IS OVER.");
            
              
                         System.out.println("YOUR'S TOTAL SCORE IS:"+s);
                        System.out.println("COMPUTER'S TOTAL SCORE IS:"+d);
                        
                      if(d>s)
                    {
                         
                       System.out.println("COMPUTER WON");
                    }
                    else if(d<s)
                    {
                        System.out.println("YOU WON");
                        
                    }
                   else if(s==d)
                    {
                     System.out.println("IT'S A TIE."); 
                     for(i = 1;i<=2000000000;i++ )
                       {
                        }
                      System.out.println("\f");
                         System.out.println("WILL YOU PLAY A SUPEROVER?,IF YES[1] ELSE NO[2].");
                         g =Integer.parseInt(cd.readLine());
                         if(g==1)
                         {
                             System.out.println("IN THIS MATCH IN SIX BALLS YOU HAVE TO SCORE MAXIMUM, IF ");
                             System.out.println("OUT THEN THE SUM WILL COUNT FURTHE AND YOU WILL MISS THE BALL. ");
                              System.out.println("YOU ARE BATTING FIRST. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         b=b+n;
                             if(n==c)
                             {
                               b=b-n;  
                            }
                        }
                            System.out.println("YOUR TOTAL BATTING SCORE IS: "+b);
                            
                           System.out.println("YOU ARE BALLING NOW. ");
                             for(i=1;i<=6;i++)
                             {
                                  System.out.println("ENTER YOUR TURN:");
                                  n = Integer.parseInt(cd.readLine());
                               while(n>6)
                                {
                           if(n>6)
                           {
                             System.out.println("SORRY ENTER A NUMBER LESS THAN 7");
                            System.out.println("ENTER YOUR  TURN: ");
                              n = Integer.parseInt(cd.readLine());
                           }
                          }
                          c =  ((int)(Math.random()*7));
                         System.out.println("COMPUTER'S TURN:"+c);
                         x=x+c;
                             if(n==c)
                             {
                               x=x-c;  
                            }
                            System.out.println("COMPUTER'S TOTAL BATTING SCORE IS: "+b);
                      
                                 
                                }
                                if(x>b)
                                {
                                    System.out.println("COMPUTER WINS.");
                                }
                                else
                                {
                                    System.out.println("YOU WON.");
                                }
                            }
                            else
                            {
                                System.out.println(" WRONG CHOICE.");
                            }
                         
                      
                    }
                     v=0;
                   
                    }
                       System.out.println("\t\t\t\t YOUR'S BATTING'S TOTAL SUM IS::"+s);
                     for(j=1;j<=2;j++)
         {
         for(i = 1;i<=2000000000;i++ )
          {
          }
        }
        System.out.println("\f");
     
            }
            while(v!=0);
            
        }
        else
        {
            
        System.out.println("SORRY WRONG CHOICE , TRY AGAIN.");
}


}
  else
        {
            
        System.out.println("SORRY WRONG CHOICE , TRY AGAIN.");
}

  System.out.println("THANKS FOR PLAYING.");
               for(i = 1;i<=2000000000;i++ )
          {
              
          }
           System.out.println("\f");
}
}