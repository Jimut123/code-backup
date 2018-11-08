import java.util.*;
class Bill
{
    int units;
    int m;
    int charge;
    int tax;
    int total;
    Telephone a[];
    Bill b[]; 
    void input()
    {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter units ");
        units=sc.nextInt();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit ");
        int n=sc.nextInt();
        m=n;
        b=new Bill[n];
        a=new Telephone[n];
        for(int i=0;i<n;i++)
        {
            b[i]=new Bill();
            b[i].input();
            b[i].charge();
            b[i].total();
            a[i]=new Telephone();
            a[i].accept();
        }
        clac();
        for(int j=0;j<n;j++)
        {
            a[j].display();
            b[j].displaY();
        }
    }
    void charge()
    {
        if(units<75)
        charge=0;
        else if(units>75&&units<150)
        charge=(units-75)*1;
        else if(units>150&&units<225)
        charge=(units-150)*2;
        else if(units>225&&units<300)
        charge=(units-225)*3;
        else
        charge=(units-3000*4);
    }
    void total()
    {
        tax=(10/100)*charge;
        total=charge+tax;
    }
    void clac()
    {
        Bill temp1=new Bill();
        Telephone temp2=new Telephone();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m-1-i;j++)
            {
                if(b[j].total<b[j+1].total)
                {
                    temp1=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp1;
                    temp2=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp2;
                }
            }
        }
    }
    void displaY()
    {
        System.out.println("units "+units);
        System.out.println("Charge "+charge);
        System.out.println("Total "+total);
    }
} 