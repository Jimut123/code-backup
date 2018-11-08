package iscxi;

import java.io.*;
class prime_numbers_co_twn_twisted
 {
     public  void input()throws IOException
      {    
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n,i,a,m,j;
         System.out.println("Enter Two 'Two Digit' Numbers");
         n=Integer.parseInt(br.readLine());
         m=Integer.parseInt(br.readLine());
         System.out.println("1.Find Twin Prime.");
         System.out.println("2.Find Co-Prime");
         System.out.println("3.Find Twisted Prime");
         System.out.println("Enter your Choice");
         a=Integer.parseInt(br.readLine());
         switch(a)
         {
             case 1:
             if(isprime(n)==1 && isprime(m)==1&& m-n==2||n-m==2)
                        System.out.println("The numbers : "+n+" and "+m+" are Twin Primes");
                        else
                        System.out.println("Not Twin Primes");
                        break;
             case 2:    
             int sum=0,diff=0,max,min;
                        sum=m+n;
                         if(m>n)
                         {
                             max =m;min=n;
                        }
                        else
                        {
                            max=n;min = m;
                        }                        
                        diff=max-min;
                        if(isprime(sum)==1||isprime(diff)==1)
                        System.out.println("The Numbers : "+n+" and "+m+" are Co-Primes");
                         else
                        System.out.println("Not Co-Primes");
                        break;
             case 3:
                        int p=0,q=0;
                       //j=reverse(n);
                       if(isprime(n)==1 && isprime(reverse(n))==1)
                        System.out.println("The twisted Numbers : "+n);
                        else
                        System.out.println("Non twisted Numbers : "+n);
                       
                         if(isprime(m)==1 && isprime(reverse(m))==1)
                        System.out.println("The twisted Numbers : "+m);
                        else
                        System.out.println("Non twisted Numbers : "+m);
                        break;
                    }
            }
                static int isprime(int n)
              {
                        int f=1,i;
                        for(i=2;i<n;i++)
                            {
                                if(n%i==0)
                                {
                                    f=0;
                                    break;
                                }
                            }
                             return(f);
                        }
                static int reverse(int n)
                    {
                            int k,s=0,c;
             
                             while(n>0)
                                 {
                                     k=n%10;
                                     s=s*10+k;
                                  n=n/10;
                                 }
                             c=s;
                              return(c);
                         }
                        }
                     
         

