import java.io.*;
class reverse_transpose
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int i,j,row,col;
            System.out.println("give row & column");
            row=Integer.parseInt(br.readLine());
            
            int arr[][]=new int[row][row];
            System.out.println("enter values");
            for(i=0;i<row;i++)
            {
                for(j=0;j<row;j++)
                {
                    arr[i][j]=Integer.parseInt(br.readLine());
                }
            }
            for(i=0;i<row;i++)
            {
                for(j=0;j<row;j++)
                 System.out.print(arr[i][j]+" ");
                System.out.println("");
            }
            for(i=0;i<row;i++)
            {
                for(j=row-1;j>=0;j--)
                 System.out.print(arr[j][i]+" ");
                System.out.println("");
            }
            
        }
        
}                 
