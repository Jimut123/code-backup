import java.io.*;

public class luckyno
{
   
    public static void input(int l)throws IOException
    
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the no    ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        int k=2;
        while(k<=l)
        {
            int pos=0;
            for(int i=0;i<l;i=i+k)
            {
                int h=arr[i];
                arr[pos]=h;
                pos=pos+1;
            }
            l=pos;
            k=k+1;
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
            
            
        
    