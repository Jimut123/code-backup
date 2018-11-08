//this program will calculate the day of the week
import java.util.*;
class Day
{
    private int dd;
    private int mm;
    private int yy;
    private int totalDays;
    private String day;    
    private int monthDays[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        String input="";
        do        
        {
            System.out.print("Date: ");
            input=sc.next();
            StringTokenizer st=new StringTokenizer(input.trim(), "/");
            dd=Integer.parseInt(st.nextToken());
            mm=Integer.parseInt(st.nextToken());
            yy=Integer.parseInt(st.nextToken());
            System.out.print("Day on 1st January: ");
            day=sc.next();
            if(input.indexOf('/')==input.lastIndexOf('/')) System.out.println("Error: Invalid date format; enter a date in dd/mm/yyyy form\n");
            if(!validifyDate()) System.out.println("Error: Invalid date; please enter a valid date\n");
        }while(input.indexOf('/')==input.lastIndexOf('/') || !validifyDate()); 
        calcDays();
        System.out.println("Day on " + input + ": " + show());
    }
    
    public boolean validifyDate()
    {        
        if((yy%400==0) || (yy%4==0 && yy%100!=0)) monthDays[1]=29; else monthDays[1]=28;
        if(mm>12) return false;
        if(dd<=0 || dd>monthDays[mm-1]) return false;
        if(yy<0) return false;
        return true;
    }
    
    public void calcDays()
    {
        totalDays=0;
        for(int i=0; i<mm-1; i++)
            totalDays += monthDays[i];
        totalDays +=dd;
    } 
    
    public String show()
    {
        String week[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int index;//stores the index of the array of a week's days
        
        for(index=0; index<7; index++)//for locating the day on which the year started
            if(day.equalsIgnoreCase(week[index])) break;  
        index-=1;
        while(totalDays>0)
        {
            index++;
            if(index==7) index=0;
            totalDays--;
        }
        return week[index];
    }
}

public class DayOfTheWeek
{
    public static void main(String args[])
    {
        new Day().get();
    }
}