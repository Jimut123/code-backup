import java.io.*;
class date_difference2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String d1,d2,ex="";
        int n,y,n1,N,i=0,nd,n2,n3;
        char ch;
        int m1[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int m2[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
        String month[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER",};
        System.out.println("Enter a day number : ");
        n=Integer.parseInt(cd.readLine());
        n2=n;
        System.out.println("Enter the year : ");
        y=Integer.parseInt(cd.readLine());
        System.out.println("Enter the date after N(1<=n<=100) : ");
        N=Integer.parseInt(cd.readLine());
        n3=N;
        n1=n;
        if(N<=100)
        {
        if(y%4==0)
        {
            while(n1>29)
            {
                if(n1>29)
                {
                    n1=n1-m1[i];
                    i++;
                }
            }
        }
        else
        {
            while(n1>28)
            {
                if(n1>28)
                {
                    n1=n1-m2[i];
                    i++;
                }
            }
        }
        nd=0;
        if(i>12)
        {
            nd=i/12;
            i=i%12;
        }
        
        System.out.println((--n1)+" TH\t"+month[i]+"\t"+(y+nd));
         n1=(n3+n2);
         if((y%4==0)&&(n1>366))
         {
             n1=n1-366;
             nd=1;
            }
            else if((n1>365)&&(y%4!=0))
            {
                n1=n1-365;
                nd=1;
            }
         i=0;
        if(y%4==0)
        {
            while(n1>29)
            {
                if(n1>29)
                {
                    n1=n1-m2[i];
                    i++;
                }
            }
        }
        else
        {
            while(n1>28)
            {
                if(n1>28)
                {
                    n1=n1-m1[i];
                    i++;
                }
            }
        }
        
        System.out.println("DATE AFTER\t"+N+"\t DAYS\t"+n1+" TH\t"+month[i]+"\t"+(y+nd));
    }
    else
    {
        System.out.println("N is not in the limit.");
    }
}
}



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        








