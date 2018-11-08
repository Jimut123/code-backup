
public class arrangearray
{
   public static void arrange()
   {
       int arr[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
                int n=3;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<n-i-1;j++)
           {
               int add1=0;
               int add2=0;
               for(int m=0;m<3;m++)
           {
               add1=add1+arr[j][m];
            }
            for(int m=0;m<3;m++)
           {
               add2=add2+arr[j+1][m];
            }
            if(add1<add2)
            {
                for(int m=0;m<3;m++)
                {
                    int temp=arr[j][m];
                    arr[j][m]=arr[j+1][m];
                    arr[j+1][m]=temp;
                }
            }
        }
    }
    for(int m=0;m<3;m++)
         {
             for(int k=0;k<3;k++)
                {
                    System.out.print(arr[m][k]);
                }
                System.out.println();
            }
    
}
}
            
            
               

