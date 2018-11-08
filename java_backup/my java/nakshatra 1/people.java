import java.util.*;
class people
{
    public static void main(String s[])
    {
        int k,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        k=n%10;
        if(k%2==0)
        System.out.print("it is even");
        else
        System.out.print("it is odd");
    }
}