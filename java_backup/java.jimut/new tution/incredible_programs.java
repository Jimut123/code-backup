import java.io.*;
import java.lang.*;
class incredible_programs
{
   public static void main(String args[]) throws IOException
   {
       {
           int a,ch,n;
           InputStreamReader ab = new InputStreamReader(System.in);
           BufferedReader cd =new BufferedReader(ab);
           System.out.println("Enter 1 for series :");
           System.out.println("Enter 2 for the factorial series: ");
           System.out.println("Enter 3 for the sum of the series:");
           System.out.println("Enter 4 for time ");
           System.out.println("Enter 5 for days ");
           ch =Integer.parseInt(cd.readLine());
           switch(ch)
           {
                case 1:
                {
                  int i;
                  float s=0;
                  System.out.println("Enter the value of a:");
                  a =Integer.parseInt(cd.readLine());
                  System.out.println("Enter the value of terms:");
                  n =Integer.parseInt(cd.readLine());
                  for(i = 1;i<=n;i++)
                  {
                      s = s +(float) Math.pow(a,i)/(a+i);
                  }
                  System.out.println("Sum is:"+s);
                }
                break;
         
                case 2:
                {
                  int i,f=1,p=1;
                  float s=0;
                  System.out.println("Enter no. of terms:");
                  n =Integer.parseInt(cd.readLine());
                  for(i=2;i<=n;i++)
                  {
                      f=f*i;
                      p=p+i;
                      s=s+(float)(p/f);
                    }
                  System.out.println("Sum is:"+s);
                  }
                break;
                case 3:
                {
                    int i;
                    float s =0;
                    for(i=1;i<=9;i++)
                    {
                        
                     if(i%2!=0)
                     {
                        s=s+(float)(i/(i+1));
                     }
                
                          else if(i%2==0)
                       {
                        s=s-(float)(i/(i+1));   
                       }
                      System.out.println("Sum is:"+s);
                }
            }
                 break;
           
                case 4:
                {
                    int h,d,sec,min;
                    System.out.println("enter no. of seconds:");
                    n =Integer.parseInt(cd.readLine());
                    h =n/3600;
                    d =n%3600;
                    min =d/60;
                    sec =d%60;
                    System.out.println("hours:" +" "+ h +" "+ "minutes:"  + min +" "+ "seconds:" +" "+ sec);
                 }
                break;
                case 5:
                {
                    int d,days,month,year;
                    System.out.println("enter no. of days:");
                    n =Integer.parseInt(cd.readLine());
                    year =n/365;
                    d =n%365;
                    month =d/30;
                    days =d%30;
                    System.out.println("year is:"+" "+year+"  month is:"+" "+month+"  days is"+" "+days);
                }
                break;
                default:
                System.out.println("WRONG CHOICE");
            }
        }
    }
  }


                    
           
                    
               
              
           
                
                    
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
