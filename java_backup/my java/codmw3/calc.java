import java.util.*;
public class calc
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,g,k;
        
        System.out.println("Enter number");
        a=sc.nextInt();
        for(k=1;k<=1000;k=k+1)
        {
            a=k;
        b=k;c=0;
        while(b>0)
        {
            c=c+1;
            b=b/10;
        }
        d=(int)Math.pow(a,2);
        e=(int)(d/Math.pow(10,c));
        g=(int)(d%Math.pow(10,c));
        if(a==(e+g))
        {
            System.out.println("Number is clc"+a);
        }
    }
}
}
        
        
        
        
        