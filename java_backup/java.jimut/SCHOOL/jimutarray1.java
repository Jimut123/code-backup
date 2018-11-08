import java.io.*;
class jimutarray1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,x=0,y=9,n,d,s=0;
        int m[]=new int[10];
        int n1[]=new int[10];
        int s1[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the"+(i+1)+"th element:");
            m[i]=Integer.parseInt(cd.readLine());
        }
        for(i=0;i<10;i++)
        {
            n=m[i];
            while(n!=0)
            {
                d = n % 10;
                s = s + d;
                n = n / 10;
            }
            n1[i]=s;
            s=0;
        }
        for(i=0;i<10;i++)
        {
            if(n1[i]%2==0)
            {
                s1[y]=n1[i];
                y--;
            }
            else if(n1[i]%2!=0)
            {
                s1[x]=n1[i];
                x++;
            }
        }
      
        
        System.out.println("The elements in sorted order are::");
        for(i=0;i<10;i++)
        {
            System.out.print(s1[i]+" ");
        }
    }
}
        