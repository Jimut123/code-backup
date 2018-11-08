import java.io.*;
class Merge_2010
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int P[] = new int[6];
        int Q[] = new int[4];
        int R[] = new int[10];
        int i,x=0;
        System.out.println("Enter the elements of array P:");
        for(i=0;i<=5;i++)
        {
             System.out.println("Enter the "+(i+1)+"elements of array P:");
             P[i]=Integer.parseInt(cd.readLine());
         }
        System.out.println("Enter the elements of array Q:");
        for(i=0;i<=3;i++)
        {
             System.out.println("Enter the "+(i+1)+"elements of array Q:");
             Q[i]=Integer.parseInt(cd.readLine());
         }
        for(i=0;i<=5;i++)
        {
             R[x]=P[i];
             x++;
            }
        for(i=0;i<=3;i++)
        {
            R[x]=Q[i];
            x++;
        }
        System.out.println("Merged array:");
        for(i=0;i<=9;i++)
        {
            System.out.print(R[i]+" ");
        }
    }
}
                