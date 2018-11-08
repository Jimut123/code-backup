import java.util.*;
class calender
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        num=sc.nextInt();
        System.out.println("Enter day ");
        String a=sc.nextLine();
    }
    void calc()
    {
        String b[]={"M","T","W","TH","F","S","SU"};
        int k;
        if(num%4==0)
         k=-1;
        String c[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int mon=-1;
        
        int n=2;
        for(int j=0;j<12;j++)
        {
            System.out.println(c[++mon]);
            
            for(int y=0;y<7;y++)
             System.out.print(b[y]+" ");
             System.out.println();
            if(j==0||j==2||j==4||j==6||j==7||j==9||j==11)
            
            {
                for(int i2=1;i2<=31+n;i2++)
                {
                    if(i2%7==0)
                    System.out.println();
                    if(i2<n+1)
                    { System.out.print("  ");
                    }
                    else
                    {
                        System.out.print(i2-n+" ");
                    }
                
                }
            
        }
    }
}
}
                        