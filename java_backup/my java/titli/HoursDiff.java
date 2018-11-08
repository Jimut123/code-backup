import java.io.*;
class HoursDiff
{
private long hD=0L;
private long mD=0L;
private int hr1,hr2,min1,min2,date1,date2,mon1,mon2,yr1,yr2;
int arr1[]={31,28,31,30,31,30,31,31,30,31,30,31};
int arr2[]={31,29,31,30,31,30,31,31,30,31,30,31};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void get()throws IOException
{
  System.out.println("enter 1st time: "+"\n hour: "+"\n min: "+"\n date: "+"\n month: "+"year: ");
  hr1=Integer.parseInt(br.readLine());
  min1=Integer.parseInt(br.readLine());
  date1=Integer.parseInt(br.readLine());
  mon1=Integer.parseInt(br.readLine());
  yr1=Integer.parseInt(br.readLine());
  System.out.println("enter 2nd time: "+"\n hour: "+"\n min: "+"\n date: "+"\n month: "+"year: ");
  hr2=Integer.parseInt(br.readLine());
  min2=Integer.parseInt(br.readLine());
  date2=Integer.parseInt(br.readLine());
  mon2=Integer.parseInt(br.readLine());
  yr2=Integer.parseInt(br.readLine());  
  calc();
}
 public void calc()
 {
     int day=0;
     boolean a=leap(yr1);
     if (a==true)
     {
         int d=arr2[mon1];
         day=day+(d-date1);
        }
        int y=yr1;
        int m=mon1+1;
        while(yr2>=y)
        {
            while(mon2>m)
            {
                boolean b=leap(y);
                if (b==true)
                {
                    day=day+arr2[m];
                    m++;
                    if (m==13)
                    {
                        y++;
                        m=1;
                    }
                }
                    else
                    {
                        day=day+arr1[m];
                        m++;
                        if(m==13)
                        {
                            y++;
                            m=1;
                        }
                    }
                }
            }
            day=day+date2;
            long hour=(long)(day*24);
            int minute1=(hr1*60)+min1;
            int minute2=(hr2*60)+min2;
            int mDif=minute2-minute1;
            hD=(long)(mDif/60);
            mD=(long)(mDif%60);
            hD=hD+hour;
            System.out.println("Difference= "+hD+"hours"+mD+"mins");
        }
        public boolean leap(int year)
        {
            if (year%4==0)
            {
                if (year%100==0)
                {
                    if (year%400==0)
                     return true;
                    else
                     return false;
                    }
                    else
                     return true;
                    }
                    return false;
                }
            }
                     
        
                        
         