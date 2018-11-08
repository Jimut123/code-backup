//this class will check for a Wonderous Square
import java.util.*;
class Wonder
{
    private int n;
    private int arr[][];

    public void get()
    {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter the size of the square matrix: ");            
            n=sc.nextInt();
            if(n<3 || n>10) System.out.println("Re enter the size , and enter a value between 2 and 10");
        }while(n<3 || n>10);
        arr=new int[n][n];
        System.out.println("Enter the matrix elements: ");
        do
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)            
                {
                    System.out.print("Enter element at [" + i + "][" + j + "]: ");
                    arr[i][j]=sc.nextInt();
                }
            }
            if(repeat()) System.out.println("You have repeated elements(s). Please re-enter elements\n");
        }while(repeat());
    }

    public boolean repeat()
    {
        int chk[]=new int[n*n];
        int count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                chk[count++]=arr[i][j];
            }
        }
        for(int i=0; i<count; i++)
        {
            for(int j=i+1; j<count; j++)
            {
                if(chk[j]==chk[i]) return true;
            }
        }

        return false;
    }

    public void check()
    {
        int limit=(int)(0.5 * n * (n*n+1));
        boolean flag=true;
        for(int i=0; i<n; i++)
        {
            int sum=0;
            for(int j=0; j<n; j++)
                sum+=arr[i][j];
            if(sum!=limit){flag=false; break;}
            sum=0;
            for(int j=0; j<n; j++)
                sum+=arr[j][i];
            if(sum!=limit){flag=false; break;}
        }
        if(!flag) System.out.println("It is not a Wonderous square");
        else System.out.println("It is a Wonderous square");
    }

    public void findPrime()
    {
        int cnt=1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(isPrime(arr[i][j]) && arr[i][j]>=2) 
                    System.out.println("Prime element #"+ cnt++ + ": " + arr[i][j] + "; position: (" + i + ", " + j + ")");
            }
        }
        if(cnt==1) System.out.println("No prime elements were found in your array");
    }   

    public boolean isPrime(int x)
    {
        for(int i=2; i<=x/2; i++)
        {
            if(x%i==0) return false;            
        }
        return true;
    }
}

public class WonderousSquare_Primes
{
    public static void main(String args[])
    {
        Wonder w=new Wonder();
        w.get();
        w.check();
        w.findPrime();
    }
}