import java.util.*;
class BurningForestMain
{
    public static void main(String args[])
    {
        BurningForest obj=new BurningForest();
        obj.get();
    }
}


//

class BurningForest
{
    private int arr[][];			
    private int r;			
    private int c; 			
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        r=sc.nextInt();
        c=sc.nextInt();
        arr=new int [r][c];
        System.out.println("Enter the pattern of the forest : 1 for a Forest and 2 for a fireline");
        for (int i=0;i<r;i++)
        { for (int j=0;j<c;j++)
            arr[i][j]=sc.nextInt();				
        }
        System.out.println("Enter the position of the fire");
        int i=sc.nextInt();
        int j=sc.nextInt();
        burn(i,j);
        show();
    }
    
    public void burn(int a,int b)
    {
        if (arr[a][b]==1)
        arr[a][b]=0;
        int p=(a==(r-1))?  r-1:a+1;
        int q=(b==(c-1))?  c-1:b+1;
        for(int i=(a==0)?   0:a-1;i<=p;i++)
        {
            for(int j=(b==0)?   0:b-1;j<=q;j++)
            {
                if(arr[i][j]==1)		
                burn(i,j);			
            }
        }
    }
    
    public void show()
    {
        for(int i=0;i<r;i++)
        {
            System.out.println();
            for(int j=0;j<c;j++)
            System.out.print("  "+arr[i][j]);
        }
     }
}
