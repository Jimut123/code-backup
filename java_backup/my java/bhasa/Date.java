import java.io.*;
class Date
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int day,year,n,s,i,f,p;
    int a[]=new int[12];
    
    void input()throws IOException
    {
        a[3]=a[5]=a[8]=a[10]=30;
        a[0]=a[2]=a[4]=a[6]=a[7]=a[9]=a[11]=31;
        System.out.println("ENTER DAY NO.");
        day=Integer.parseInt(br.readLine());
        System.out.println("ENTER YEAR");
        year=Integer.parseInt(br.readLine());
        System.out.println("ENTER DAY AFTER(N)");
        n=Integer.parseInt(br.readLine());
        if(leap(year)==1)
        a[1]=29;
        else
        a[1]=28;
        System.out.println("DATE IS =");
        output(day,year);
        day=day+n;
        System.out.println("DATE AFTER "+n+" DAYS IS =");
        if(day>365 && leap(year)==0)
        {
            year++;
            if(leap(year)==1)
            a[1]=29;
            output(day-365,year);
        }
        else
        if(day>366 && leap(year)==1)
        {
            year++;
            a[1]=28;
            output(day-366,year);
        }
        else
        {
            output(day,year);
        }
    }
    
    void output(int d,int y)throws IOException
    {
        s=0;
        i=0;
        p=0;
        while(d-s>=29 && s<=366)
        {
            if(i==11)
            {
            p=p+1;
            break;
            }
            else
            {
            s=s+a[i];
            p=i;
            i++;
            }
        }
        write(d-s,p,y);
    }
    
    void write(int d,int m,int y)throws IOException
    {
        
            System.out.println(d+"-"+month(p)+"-"+y);
    
    }
    
    int leap(int y)
    {
        f=0;
        if(y%4==0)
        f=1;
        else
        f=0;
        return f;
    }
    
    String month(int m)
    {
        m=m+1;
        if(m==1)
        return "January";
        else
        if(m==2)
        return "February";
        else
        if(m==3)
        return "March";
        else
        if(m==4)
        return "April";
        else
        if(m==5)
        return "May";
        else
        if(m==6)
        return "June";
        else
        if(m==7)
        return "July";
        else
        if(m==8)
        return "August";
        else
        if(m==9)
        return "September";
        else
        if(m==10)
        return "October";
        else
        if(m==11)
        return "November";
        else
        if(m==12)
        return "December";
        else
        return "error";
    }
}
    