import java.io.*;
class date
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,d,m,y,f=1,s=0;
        int nod[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter the date in the format DD/MM/YYYY");
        d=Integer.parseInt(cd.readLine()); 
        m=Integer.parseInt(cd.readLine()); 
        y=Integer.parseInt(cd.readLine());
        if(m>12)
        f=0;
        if(m==2)
        {
            if(y%4==0)
            {
                if(d>29)
                f=0;
                else if(d>28)
                f=0;
            }
        }
        if((m==1)||(m==3)||(m==7)||(m==8)||(m==10)||(m==12))
        {
            if(d>31)
            f=0;
            else if(d>30)
            f=0;
        }
        if(f==1)
        {
            System.out.println("Date is valid.");
            i=1;
            while(i<m)
            {
                s=s+nod[i];
                i++;
            }
            s=s+d;
            System.out.println("Total no of days elasped:"+s);
        }
        else
        {
            System.out.println("Invalid date.");
        }
    }
}
        
         