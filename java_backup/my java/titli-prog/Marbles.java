//Marbles
import java.util.*;
class Marbles
{
    private int arr[];
    private int n;
    private int c;
    private int p;
    public Marbles()
    {   get(); }
    public void get()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of marbles");
        n=sc.nextInt();
        System.out.println("Enter their colours");
        c=sc.nextInt();
        arr=new int [c];
        for (int i=0;i<c-1;i++)
        arr[i]=1;
        while(add()!=n)
        calc(c-1);
    }
    public int add()
    {
        int s=0;
        for (int i:arr)
        s+=i;
        return s;
    }
    public void calc(int k)
    {
        if(k<0)
        {
            System.out.println("The possibilties are : "+p);
            System.exit(0);
        }
        arr[k]++;
        if(add()==n)
        {
            p++;
            arr[k]++;
        }
        else if(add()>n)
        {
            arr[k]=1;
            calc(k-1);
        }
    }
}
