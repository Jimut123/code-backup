//checking validity of date and findin the day of given date
import java.io.*;
class Date
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private String d,fday;
    private int day,month,yr;
    private String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private int mon[]={31,28,31,30,1,30,31,31,30,31,30,31};
    public void get()throws IOException
    {
        do
        {
            System.out.println("Enter date (dd/mm/yyyy)");
            d=br.readLine();
            isLeap();
        }while(isValid(d)==false);
        findDay();
    }
    public boolean isValid(String dat)
    {
        String a="",b="";
        for(int i=0;i<dat.length();i++)
        {
            if(dat.charAt(i)!='/')
            a+=dat.charAt(i);
            else
            {
                while(dat.charAt(i+1)!='/')
                {
                    b+=dat.charAt(i+1);
                    i++;
                }
                break;
            }
        }
        day=Integer.parseInt(a);
        month=Integer.parseInt(b);
        if(day<0||month<0||month>12||day>mon[month-1])
        return(false);
        return(true);
    }
    public void isLeap()
    {
        String a="";
        for(int i=d.length()-1;i>=0;i--)
        {
            if(d.charAt(i)!='/')
            a=d.charAt(i)+a;
            else
            break;
        }
        if(yr%4==0 || (yr%400==0&&yr%100!=0))
        mon[1]+=1;
    }
    public void findDay()throws IOException
    {
        int sum=0,pos=0,c;
        do
        {
            c=0;
            System.out.println("Enter day of week on Jan 1,"+yr);
            fday=br.readLine();
            for(int i=0;i<7;i++)
            {
                if(fday.equalsIgnoreCase(week[i]))
                c=1;
            }
         }while(c!=1);
        for(int i=0;i<month-1;i++)
        sum+=mon[i];
        sum+=day;
        for(int i=0;i<7;i++)
        {
            if(fday.equalsIgnoreCase(week[i]))
            {
                pos=i;
                break;
            }
        }
        sum%=7;
        int dayWeek=pos+sum;
        if(dayWeek>7)
        dayWeek-=7;
        if(dayWeek<0)
        dayWeek+=7;
        System.out.println("Day of week on "+d+" is "+week[dayWeek-1]);
    }
}
