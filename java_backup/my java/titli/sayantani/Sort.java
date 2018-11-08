//2d sort
import java.util.*;
class Sort
{   
     public void get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int temp[][]=new int[r][c];
        System.out.println("Enter array elements");
        for(int i=0;i<r;i++)
        {   for(int j=0;j<c;j++)
            {   arr[i][j]=sc.nextInt();
                temp[i][j]=arr[i][j];
            }
        }
        System.out.println("Unsorted array");
        show(arr);          
        System.out.println("Row-sorted array");
        sort(r,c,c-1,arr,'r');
        System.out.println("Column-sorted array");
        sort(c,r,r-1,temp,'c');
        System.out.println("Sorted array");
        for(int i=0;i<r;i++)
        {   for(int j=0;j<c;j++)
            {   int a=i,b=j,y=j;
                for(int x=i;x<r;x++)
                {   for(;y<c;y++)
                    {   if(arr[x][y]<arr[a][b])         
                        {   a=x;    b=y;    }       
                    }
                    y=0;
                }
                swap(a,b,i,j,arr);
            }
        }
        show(arr);
        System.exit(0);
    }
    public void sort(int x,int y,int z,int arr[][],char c)
    {
        for (int i=0;i<x;i++)
        {   for (int j=0;j<y;j++)
            {   for (int k=0;k<z;k++)
                {   if(c=='r'&&arr[i][k]>arr[i][k+1])
                        swap(i,k,i,k+1,arr);
                    else if(c=='c'&&arr[k][i]>arr[k+1][i])
                        swap(k,i,k+1,i,arr);
                }
            }
        }
        show(arr);
    }
    public void show(int arr[][])
    {
        for (int i=0;i<arr.length;i++)
        {   for (int j:arr[i])      // Enhanced for loop
                System.out.print("  "+j);
            System.out.println();
        }
    }
    public void swap(int a,int b,int c,int d,int arr[][])
    {
        int t=arr[a][b];
        arr[a][b]=arr[c][d];
        arr[c][d]=t;
    }}										        			


class SortMain
{
    public static void main(String args[])
    {
        Sort obj=new Sort();
        obj.get();
    }
}
