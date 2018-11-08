import java.io.*;
public class finder
{
    int Start , Last;
    public finder(){}     
    public finder(int s, int l)
    {
        Start = s;
        Last = l;
    }
    public static void main(String args[]) throws IOException
    {
        finder abc = new finder();
        abc.print_prime();
    }
    int check_Prime(int d)
    {
        int a = 1;
        for(int i = 2; i <= d/2 ; i++)
        {
            if(d%i == 0)
            {
                a = 0;
                break;
            }
        }
        return a;
    }
    int check_prime(){return Last;}
    void print_prime()
    {
        System.out.println("THE PRIME NUMBERS ARE LISTED BELOW::");
        for(int i = Start; i <= Last; i++)
        {
            if(check_Prime(i)==1)
            {
                System.out.println(i);
            }
        }
    }
}