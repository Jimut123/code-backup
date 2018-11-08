
import java.io.*;
public class Queen
{
  int arr[][]={{1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1},
             {1,1,1,1,1,1,1,1}};
   public  void takein(int a,int b)throws IOException
   {
       a--;
       b--;
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       if(arr[a][b]==0)
       {
       System.out.println("Enter Row ");
       a=Integer.parseInt(br.readLine());
       System.out.println("Enter Collunm ");
       b=Integer.parseInt(br.readLine());
    }
    else
    {
        arr[a][b]=9;
        for(int i=0;i<8;i++)
        {
            if(i!=a)
            arr[i][b]=0;
        }
        for(int i=0;i<8;i++)
        {
            if(i!=b)
            arr[a][i]=0;
        }
        int m=a+1;
        int n=b+1;
        int t=a-1;
        int u=b-1;
        
        while(m<8 && n<8)
        {
            
            
            arr[m][n]=0;
            m++;
            n++;
        }
        while(t>=0 && u>=0)
        {
            
            arr[t][u]=0;
            --t;
            --u;
        }
    }
    for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
        {
            System.out.print(arr[i][j]+"   ");
        }
        System.out.println();
    }
}
    
    
        
       
       
}
