package iscxi;

import java.io.*;
class largest_prime
 {
     static void main(String args[])throws IOException
      {
          int n,s,max=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Enter Numbers");
               System.out.println("Press 0 to Stop");
                while(true)
                      {
                          n=Integer.parseInt(br.readLine());
                          if(n>0)
                          {
                              s=isPrime(n);
                              if(s==1)
                              {
                                  if(n>max)
                                  {
                                     max=n;
                                     
                                    }
                                }
                                
                                }
                                else if(n==0||n<0)
                                    break;
                                }
                   System.out.println("The Largest Prime is :"+ max);
                }
                static int isPrime(int n)
                {
                    int k=0,i;
                    for(i=2;i<n;i++)
                    {
                        if(n%i==0)
                        {
                           k=1;
                           break;
                        }
                        }
                        if(k==1)
                        return 0;
                        else
                        return 1;
                    }
                }
         

