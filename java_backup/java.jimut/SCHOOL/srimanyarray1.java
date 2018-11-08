import java.io.*;
class srimanyarray1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,x=9,y=0;
        int m[]=new int[10];
        int n[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the"+(i+1)+"th element:");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<10;i++)
        {
            if(m[i]%3==0)
            {
                n[x]=m[i];
                x--;
            }
            else if(m[i]%3!=0)
            {
                n[y]=m[i];
                y++;
            }
        }
        System.out.println("The elements in sorted order are::");
        for(i=0;i<10;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
        