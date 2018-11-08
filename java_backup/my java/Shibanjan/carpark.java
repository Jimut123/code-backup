import java.io.*;
class carpark
{
    int car[]=new int[100];
    int f,r,size,val;
    carpark()
    {
        for(int i=0;i<100;i++)
        {
            char a;
            car[i]=0;
            f=-1;r=-1;
            size=100;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("if you want to enter the car press y");
            a=br.readLine();
            if(a==y)
            carpark.entercar();
        }
    }
    void entercar(int carenter)
    {
        if(r==size-1)
        System.out.println("parking overflows");
        else
        {
            if(f==-1&&r==-1)
            {
                f=0;r=0;
            }
            else
            r=r+1;
            car[r]=carenter;
        }
    }
    void exitcar()
    {
        if(f==-1&&r==-1)
        System.out.println("parking overflows");
        else
        {
            val=car[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            f=f+1;
        }
    }
    void display()
    {
        System.out.println("Elements of the parking");
        for(int j=f;j<=r;j++)
        System.out.println(car[j]);
    }
}