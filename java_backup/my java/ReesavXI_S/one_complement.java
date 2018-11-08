import java.util.*;
class one_complement
{
    String num=" ";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextLine();
    }
    void clac()
    {
        String z=" ";
        int i=0,j=0;
        for(i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='1')
            z=z+"0";
            else
            z=z+"1";
        }
        System.out.print(z);
    }
}