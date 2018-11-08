import java.io.*;
class srimanyarray2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,x=9,y=0;
        int m[] =new int[10];
        int n[] =new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the "+(i+1)+"th element:");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<10;i++)
        {
            if(m[i]%2==0)
            {
                n[x]=m[i]+2;
                x--;
            }
            else if(m[i]%2!=0)
            {
                n[y]=m[i]-3;
                y++;
            }
        }
        System.out.println("The array in sorted order:");
        for(i=0;i<10;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
                
            
            
       