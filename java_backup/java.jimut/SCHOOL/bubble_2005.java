import java.io.*;
class bubble_2005
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader (ab);
        int m[]=new int[10];                                        //allocating memory to an array
        int i,j,t;
        System.out.println("Enter 10 nos. :");
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the "+(i+1)+" th element :");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<=8;i++)
        {
            for(j=0;j<=(8-i);j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("Elements in sorted order:");
        for(i=0;i<10;i++)
        {
            System.out.println(m[i]);
        }
    }
}