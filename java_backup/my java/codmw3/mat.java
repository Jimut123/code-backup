import java.util.*;
public class mat
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,e,d,sum1=0,sum3=0,sum2=0,sum4=0;
        System.out.println("Enter number of colums");
        a=sc.nextInt();
        int c[][]=new int[a][a];
        for(d=0;d<a;d=d+1)
        {
            for(e=0;e<a;e=e+1)
            {
                System.out.println("Enter vale");
                c[d][e]=sc.nextInt();
            }
        }
        
        for(e=0;e<a;e=e+1)
        {
            sum1=sum1+c[0][e];
            sum2=sum2+c[a-1][e];
        }
        for(e=0;e<a;e=e+1)
        {
            sum3=sum3+c[e][0];
            sum4=sum4+c[e][a-1];
            
        }
    System.out.println(+sum1);
    System.out.println(+sum2);
    System.out.println(+sum3);
    System.out.println(+sum4);
}
}
                 
       