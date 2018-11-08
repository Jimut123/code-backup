import java.io.*;
class selessort_wt_2011
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int weight[]=new int[10];
        System.out.println("Enter the weight of ten people:");
        int i,j,min,t;
        for(i=0;i<10;i++)
        {
            weight[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<9;i++)
        {
            min = i;
            for(j=(i+1);j<10;j++)
            {
                if(weight[min]>weight[j])
                {
                    min =j;
                }
                t=weight[i];
                weight[i]=weight[min];
                weight[min]=t;
            }
        }
        System.out.println("Weights of the peoples in descending order:");
        for(i=0;i<9;i++)
        {
            System.out.print(weight[i]+" ");
        }
    }
}
                