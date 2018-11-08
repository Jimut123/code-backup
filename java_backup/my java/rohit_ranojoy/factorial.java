public class factorial
{
public static void main(int num)
{
    int fact=1;
    for(int i=1;i<=num;i++)
     fact*=i;
    System.out.println("factorial="+fact);
}
}