//this class will show unique numbers within a range
import java.util.*;
class Unique
{
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        int s, e;
        do{
            System.out.print("Enter the starting point: ");
            s=sc.nextInt();
            System.out.print("Enter the end point: ");
            e=sc.nextInt();
        }while(s>e);
        show(s, e);
    }

    public void show(int start, int end)    
    {
        int c=0;
        for(int i=start; i<=end; i++)
        {            
            if(isUnique(i)){c++; System.out.print(i + "  ");}
        }
        System.out.println("\n\nThere are " + c + " unique numbers within the range you entered");
    }

    public boolean isUnique(int x)
    {        
        int nos[]=new int[String.valueOf(x).length()];
        for(int i=nos.length-1; i>=0; i--)
        {
            nos[i]=x%10;
            x/=10;
        }
        
        for(int i=0; i<nos.length; i++)
        {
            for(int j=i+1; j<nos.length; j++)
            {
                if(nos[j]==nos[i]) return false;
            }
        }
        
        return true;
    }
}

public class UniqueSeries
{
    public static void main(String args[])
    {
        new Unique().get();
    }
}