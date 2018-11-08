//to input any multidigit number and display the square of the lowest and squareroot of the highest .
import java.util.*;
class first
{
    public static void main()
    {
        int n,k,b,a,max,min;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        
        min=a%10;
        max=a%10;
        while(a>0)
        {
            k=a%10;
            if(k>max)
            max=k;
            else
            if(k<min)
            min=k;
            a=a/10;
        }
            System.out.println(Math.pow(max,2));
            System.out.println(Math.sqrt(min));
        
    }
}