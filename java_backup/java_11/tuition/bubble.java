import java.io.*;
class bubble
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int m[] = new int[10];
        int i,j,t;
        System.out.println("\f");
        System.out.println("Enter 10 numbers.");
        for(i=0;i<10;i++)
        {
            m[i] = Integer.parseInt(cd.readLine());
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<(9-i);j++)
            {
                if(m[j]>m[j+1])
                {
                t=m[j];
                m[j]=m[j+1];
                m[j+1]=t;
            }
            }
        }
        System.out.println("The resultant array is:");
        for(i=0;i<10;i++)
        {
             System.out.println(m[i]);
        }
    }
}
        
        
        
        
        