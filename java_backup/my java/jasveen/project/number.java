package project;
//Write a program in java to print the following series-2 4 7 11 16...N.

class number
{
    public static void main(int n)
    {
        int i;
        int j=2;
        int v=2;
        int s=0;
        for(i=1;i<=n;i++)
        {
        System.out.println(j);
        
            j=j+v;
            v=v+1;
        }
    }
}