import java.io.*;
class Time
{
    int hour1,hour2,hour3,min1,min2,min3,s,n;
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    void accept()throws IOException
    {
        System.out.println("Enter the first time in hour:");
        hour1 = Integer.parseInt(cd.readLine());
        
        System.out.println("Enter the first time in minutes:");
        min1 = Integer.parseInt(cd.readLine());
        
        System.out.println("Enter the first time in hour:");
        hour2 = Integer.parseInt(cd.readLine());
        
        System.out.println("Enter the first time in minutes:");
        min2 = Integer.parseInt(cd.readLine());
    }
    void add()
    {
        min3 =min1+min2;
        if(min3>60)
        {
            s=min3%60;
            n=min3/60;
            hour3=hour3+n+hour1+hour2;
            min3=s;
        }
        else
        {
            hour3=hour1+hour2;
        }
    }
    void display()
    {
        System.out.println("Total hours : "+hour3+" and total minutes = "+min3);
    }
    public static void main(String args[])throws IOException
    {
        Time ob = new Time();
        ob.accept();
        ob.add();
        ob.display();
    }
}