import java.io.*;
class sort
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr the no.of elements");
        int n=Integer.parseInt(in.readLine());
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enetr your String");
            a[i]=in.readLine();
            }
            for(int j=0;j<n-1;j++)
            for(int k=j+1;k<n;k++)
            if(a[j].compareTo(a[k])>0)
            {
                String t=a[j];
                a[j]=a[k];
                a[k]=t;
            }
            for(int s=0;s<n;s++)
            System.out.println(a[s]);
        }
    }
