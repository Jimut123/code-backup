 
import java.io.*;
class date
{//declaration of class
 public static void main(String args[])throws IOException
 {
     BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
     int date;int d,m,y;int d1=0;//declaring variables
     System.out.println("ENTER THE DATE IN SIX DIGIT FORMAT:");
     date=Integer.parseInt(in.readLine());
     d1=date;
     y=date%100;
     date=date/100;
     m=date%100;
     date=date/100;
     d=date;
     if(y>=0)
     {//checking for month
         if(((m==1)&&(d<=31))||((m==2)&&(d<=29))||((m==3)&&(d<=31))||((m==4)&&(d<=30))||((m==5)&&(d<=31))||((m==6)&&(d<=30))||((m==7)&&(d<=31))||((m==8)&&(d<=31))||((m==9)&&(d<=30))||((m==10)&&(d<=31))||((m==11)&&(d<=30))||((m==12)&&(d<=31)))
         {
             System.out.print(d+"th"+" ");
             if(m==1)//displaying the months
             System.out.print("january");
             if(m==2)
             System.out.print("february");
             if(m==3)
             System.out.print("march");
             if(m==4)
             System.out.print("april");
             if(m==5)
             System.out.print("may");
             if(m==6)
             System.out.print("june");
             if(m==7)
             System.out.print("july");
             if(m==8)
             System.out.print("august");
             if(m==9)
             System.out.print("september");
             if(m==10)
             System.out.print("october");
             if(m==11)
             System.out.print("november");
             if(m==12)
             System.out.print("december");
             System.out.print("'");
             System.out.print(y);
            }
            else{//printing the result
                System.out.println("INVALID DATE");
            }
        }
        else{
            System.out.println("INVALID DATE");
        }
    }//end of main
}//end of class
        