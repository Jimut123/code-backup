import java.io.*;
public class arrpos
{
    public static void main(String []args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter row");
        int n=Integer.parseInt(br.readLine());
        int arr=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter no");
                    arr[i]=Integer.parseInt(br.readLine());
        }       
        System.out.println("enter no of places ");
        int m=Integer.parseInt(br.readLine());
        int a[]=new int [m];
        for(int i=0;i<m;i++)
        {
            System.out.println("enter no");
                    a[i]=Integer.parseInt(br.readLine());
        }
        int s=0;
        int max;
        while(s!=2)
        {
            
            for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i]
           
        }
            
        
        
        
        
        
        
        
        
    }
}
