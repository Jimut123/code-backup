import java.util.*;
class srtt
{
    int a, n, i,s=0,k;
    srtt()
    {
        a=0;
        n=0;
    }
    void calculate()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of a and n");
        a= sc.nextInt();
        n= sc.nextInt();
        
        s=0;
        k=4;
        for(i=1; i<=n; i=i+1)
        {
            if(i%2==0)
            s=s+(int)Math.pow(a,i)/k;
            else
            s=s-(int)Math.pow(a,i)/k;
            k=k*2;
        }
            System.out.println("sum"+s);
        }
    }
        
    


    