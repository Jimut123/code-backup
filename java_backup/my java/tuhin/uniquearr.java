import java.io.*;

public class uniquearr
{
   
    public static void main(String []args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        boolean r;
        System.out.println("enter row");
        int n=Integer.parseInt(br.readLine());
        System.out.println("enter col");
        int m=Integer.parseInt(br.readLine());
        int x;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                do
                {
                     r=true;
                    System.out.println("enter no");
                    x=Integer.parseInt(br.readLine());
                    for(int k=0;k<=i;k++)
                    {
                        for(int l=0;l<=j;l++)
                        {
                            if(arr[k][l]==x)
                            {
                                System.out.println("The no already exits");
                                r=false;
                                break;
                            }
                        }
                    }
                }while(r==false);
                arr[i][j]=x;
            }
        }
                    
        
        
        
    }

    
}
