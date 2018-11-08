package func_rec_;
import java.util.*;
class String_long
{
    String s;
    String max;String min;
    int maxi=0;
    String z;
    int mini;
    String_long()
    {
        s="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        s=sc.nextLine();
        mini=s.length();
    }
    void clac(String s2,int i)
    {
        if(i==s2.length()-1)
        return;
        if(s2.charAt(i)!=' ')
        {
            z=z+s2.charAt(i);
            clac(s2,i+1);
        }
        count(z);
        z="";
        clac(s2,i+1);
    }
    void count(String s1)
    {
        int maxim=s1.length();
        int minim=s1.length();
        if(maxim>maxi)
        {
            maxi=maxim;
            max=s1;
        }
        else if(minim<mini)
        {
            mini=minim;
            min=s1;
        }
        return;
    }
    void display()
    {
        System.out.println("Longest string "+max+" ");
        System.out.print("Shortest string "+min);
    }
    void main()
    {
        input();
        clac(s,0);
        display();
    }
}  