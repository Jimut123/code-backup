import java.io.*;
class Date2
{
 public static void main(String args[])throws IOException
 { int k1,k,t,s,i,z,l;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     System.out.println("Enter The Number");
     int n=Integer.parseInt(br.readLine());
     if(n<5)
     {
     
     System.out.println("Invalid Entry Please Renter");
     System.exit(0);
     }
     else
     {String p[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
         k=n%10000;
         z=k;
         t=n/10000;
         System.out.println(t);
         if(k%4==0 || k%400==0)
         
         k1=366;
         else
         k1=365;
         if(t>k1)
         {
             t=t-k1;
             k=k+1;
         }
         
             s=0;
             for(i=1;i<=t;i++)
             {
                 if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                 {
                     z=31;
                 s=s+31;
                }
                else
                if(i==2)
                {
                 if(k%4==0 || k%400==0)
                 {
                     s=s+28;
                     z=28;
                    }
                    else
                    {
                        s=s+29;
                        z=29;
                    }
                 
                 }
                else
                {
                    s=s+30;
                    z=30;
                }
                 
                 if(s>t)
                 {
                     s=s-z;
                     //p=i;
                     break;
                 }
             }
             //p=p-1;
             t=t-s;
         
         System.out.println(t+"th"+p[i-1]+k);
        }
    }
}

                 
                     
          