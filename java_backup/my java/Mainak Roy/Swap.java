import java.util.*;
public class Swap
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter side");
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            System.out.println("enter array ");
            for(int i=0;i<n;i++)
            {
                    for(int j=0;j<n;j++)
                    {
                        System.out.println("row"+(i+1)+"column"+(j+1));
                        a[i][j]=sc.nextInt();

                    }
    }
    int c=0;
    if(n%2==0)
    {   
      c=n/2;
    }   
    else
    {   
         c=n/2-1;
    }   
    for(int i=0;i<c;i++)
    {
        for(int j=0;j<n;j++)
        {
            int p=a[i][j];
            a[i][j]=a[n-i-1][j];
            a[n-i-1][j]=p;
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print(a[i][j]+"  ");
        }
        System.out.println();
    }
}
}

