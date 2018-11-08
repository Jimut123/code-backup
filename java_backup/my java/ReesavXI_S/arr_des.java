import java.io.*;
class arr_des
{
    int n;
    void input()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter size");
        n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int i=0;
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number");
            a[i]=Integer.parseInt(in.readLine());
        }
        int b[]=new int[n];
        int j=0,k=0;
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
            b[j]=a[i];
            j++;
        }
    }
    for(k=0;k<n;k++)
    {
        if(a[k]%2!=0)
        {
            b[j]=a[k];
            j++;
        }
    }
    for(i=0;i<n;i++)
    {
        System.out.print(b[i]+" ");
    }
}
}
