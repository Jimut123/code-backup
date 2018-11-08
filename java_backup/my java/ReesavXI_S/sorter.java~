import java.util.*;
class sorter
{
    int a[];
    sorter()
    {
        a=new int[10];
    }
    void readlist()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a number ");
            a[i]=sc.nextInt();
        }
        System.out.println();
    }
    void displaylist()
    {
        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    int indexofmin(int startindex)
    {
        int min=a[startindex];int j=0;
        for(int i=startindex;i<10;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
                j=i;
            }
        }
        return j;
    }
    void main()
    {
        readlist();
        displaylist();
        int n;
        n=indexofmin(5);
        System.out.print(n+" ");
    }
}