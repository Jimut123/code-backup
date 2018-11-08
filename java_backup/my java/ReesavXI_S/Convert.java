import java.util.*;
class Convert
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a anumber ");
        n=sc.nextInt();
        n=rev(n);
    }
    void ext_digit(int n)
    {
        if(n==0)
        return;
        int a=0;
        a=n%10;
        num_to_words(a);
        n=n/10;
        ext_digit(n);
    }
    void num_to_words(int s)
    {
        if(s==0)
        System.out.print("0");
        else if(s==1)
        System.out.print("1");
        else if(s==2)
        System.out.print("2");
        else if(s==3)
        System.out.print("3");
        else if(s==4)
        System.out.print("4");
        else if(s==5)
        System.out.print("5");
        else if(s==6)
        System.out.print("6");
        else if(s==7)
        System.out.print("7");
        else if(s==8)
        System.out.print("8");
        else if(s==9)
        System.out.print("9");
        else 
        return;
    }
    int rev(int n)
    {
        int s=0;
        int a=0;
        while(n>0)
        {
        a=n%10;
        s=(s*10)+a;
        n=n/10;
       }
        return s;
    }
}