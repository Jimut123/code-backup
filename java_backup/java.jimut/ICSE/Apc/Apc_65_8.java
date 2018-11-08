package Apc;
import java.io.*;
class Apc_65_8
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int P[]=new int[6];
        int Q[]=new int[4];
        int R[]=new int[10];
        int i,s=0;
        for(i=0;i<6;i++)
        {
            System.out.println("Enter the"+(i+1)+"th number:");
            P[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<4;i++)
        {
            System.out.println("Enter the"+(i+1)+"th number:");
            Q[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<6;i++)
        {
            R[s]=P[i];
            s++;
        }
          for(i=0;i<4;i++)
        {
            R[s]=Q[i];
            s++;
        }
        System.out.println("THE ELEMENTS ARE:");
        for(i=0;i<10;i++)
        {
            System.out.println(R[i]);
        }
      }
}
