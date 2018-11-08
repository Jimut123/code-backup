//calculating new time after adding given seconds to current time
import java.io.*;
class Time
{
  int hr,min,sec,noSec;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void get()throws IOException
  {
      System.out.println("enter current time");
      System.out.println("enter hour");
       hr=Integer.parseInt(br.readLine());
      System.out.println("enter minutes");
       min=Integer.parseInt(br.readLine()); 
      System.out.println("enter seconds");
       sec=Integer.parseInt(br.readLine()); 
      System.out.println("enter no. of seconds to be added");
       noSec=Integer.parseInt(br.readLine());
      newTime(); 
    }
    public void newTime()
    {
        int h1=hr,m1=min,s1=sec;
        int secs=noSec;
        int dif;
        do
        {
            dif=60-s1;
            if (secs>=dif)
            {
                s1=s1+dif;
                secs=secs-dif;
            }
            if (s1>=60)
            {
                m1++;
                s1=s1-60;
            }
            if (m1>=60)
            {
                h1++;
                m1=m1-60;
            }
            if (h1>=24)
             h1=h1-24;
            //System.out.println(h1+","+m1+","+s1); 
            }while(secs>=60);
            if (secs>0)
             s1=s1+secs;
            System.out.println("New time: "+h1+":"+m1+":"+s1);
        }
    }
            
                
                