
import java.io.*;
class Date1
{//declaration of class
    int a[]={31,28,31,30,31,30,31,31,30,31,30,31};//array containing the no:of days of each month
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s,d,d1;//inisialisation of variables
    int x=-1,i,d2,m,y,l;//inisialisation of variables
    String b[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",};//array containing the days
    public static void main(String args[])throws IOException
    {//function to call the other functions
        Date1 ob=new Date1 ();
        ob.take();
        ob.show();
    }//end of function
    public void take()throws IOException
    {//function to take input and seperate the figure
        System.out.println("Enter the date ( in dd/mm/yyyy) format:");
        d=br.readLine();
        d1=d;
        i=d.indexOf("/");
        d2=Integer.parseInt(d.substring(0,i));
        d=d.substring(i+1);
        i=d.indexOf("/");
        m=Integer.parseInt(d.substring(0,i));
        d=d.substring(i+1);
        y=Integer.parseInt(d);
        l=0;
        if(m>2)
        l=leap(y);
        System.out.println("Enter the Day on 1st January in this year:");
        s=br.readLine();
    }//end of function
    int leap(int p)
    {//function to check leap year
        if(p%4==0||p%400==0)
        return 1;
        else
        return 0;
    }//end of function
    void show ()
    {//function to print the day of the given date
        for(i=0;i<7;i++)
        {//loop to get the poition of the day on 1st january in the string b 
            if (s.equalsIgnoreCase(b[i]))
            x=i;
        }//end of loop
        if(x==-1)
        {//loop to show error(if any)
            System.out.println("error: Enter day");
            System.exit(1);
        }//end of loop
        for(i=0;i<m-1;i++)//loop to find the days after
            d2=d2+a[i];
        d2=d2+l;
        for(i=0;i< d2-1;i++)
        {//loop to find the name of the day
            x++;
            if(x==7)
            x=0;
        }//end of loop
        System.out.print("The day on "+d1+ " is: ");
        System.out.print(b[x]);
     }//end of function
}//end of class
