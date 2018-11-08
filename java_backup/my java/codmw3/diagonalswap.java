import java.io.*;
class diagonalswap{
    int a[][],n,i,j,k;
    void diagonal()
    {
        n=0;
    }
    void input()throws IOException
    {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        i=0;
        swap1(a,i,n);
        display();
        
    }
    void swap1(int a[][],int i,int n)
    {
        if(i>=n)
        {
            return;
        }
        else{
            k=a[i][i];
           a[i][i]= a[i][n-i-1];
            a[i][n-i-1]=k;
            swap1(a,i+1,n);
        }
    }
   void display() {
       for(int i=0;i<n;i++)
       { for(int j=0;j<n;j++)
           { System.out.print(a[i][j]); }
           System.out.println();
        }
    }
}

 

