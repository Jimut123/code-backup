package assignment;

import java.io.*;
class date_check
{
    int dd,mm,yyyy,i,k;
    int a[]={31,28,31,30,31,30,31,30,31,30,31,30,31};
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.println("give the date");
        dd=Integer.parseInt(br.readLine());
        mm=Integer.parseInt(br.readLine());
        yyyy=Integer.parseInt(br.readLine());
        calc();
    }
    void calc()
    {
        if(mm<1||mm>12)
        {
            System.out.println("error in month, input must be in between 1-12");
            System.exit(0);
        }
        k=a[mm-1];
        if(mm==2)
        {
            if(yyyy%4==0||yyyy%400==0)
            k=k+1;
            if(dd>k)
            {
                System.out.println("error id date");
                System.exit(0);
            }
            
        }
        else
        if(dd>k)
        {
          System.out.println("error id date");
                System.exit(0);
            }
        System.out.println("valid date"+dd+":"+mm+":"+yyyy);
    }
}