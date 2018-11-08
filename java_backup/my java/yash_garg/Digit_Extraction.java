import java.util.*;
class Digit_Extraction
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no. ");
        int n=sc.nextInt();
        int d,sq;
        while(n>0)
        {
            d=n%10;
            sq=d*d;
            n=n/10;
            System.out.println(" The digit extarcted is "+d+" and its square is "+sq);
        }
    }
}
        