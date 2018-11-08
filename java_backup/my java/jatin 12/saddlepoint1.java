import java.io.*;
class saddlepoint1
{//declaration of class
    public static void main(String args[])throws IOException
    {//declaration of main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int min=0;//inisialisation of variables
        int i,n,j,k=0,k1=0;//inisialisation of variables
        System.out.println("Enter array length:");
        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];//declaration of array
        System.out.println("Enter the numbers in array");
        for(i=0;i<n;i++)
        {//loop to take input in array
            for(j=0;j<n;j++)
            {
                System.out.println("Enter element for position ("+i+","+j+")");
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }//end of loop
        System.out.println("ORIGINAL ARRAY");
        for(i=0;i<n;i++)
        {//loop to print the inputted array
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }//end of loop
        int f=0;
        for(i=0;i<n;i++)
        {//loop to check saddle point
            min=a[i][0];
            for(j=0;j<n;j++)//loop to find minimum of row
            if(a[i][j]<=min)
            {
                min=a[i][j];
                k=j;
            }
            int max=a[0][k];
            for(j=0;j<n;j++)
            {//loop to find max of column
                if(a[j][k]>=max)
                {
                    max=a[j][k];
                    k1=j;
                }
            }//end of loop
            if(a[i][k]==a[k1][k])
            {//checking saddle point
            System.out.println("Saddle point is on: ("+i+","+j+ ") Element:" +min);
            f=1;
            }
        }//end of loop
        if(f==0)
        System.out.println("Saddle point not found:");
    }//end of main
}//end of class