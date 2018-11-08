import java.io.*;
class gogol{
    int a[][],n,i,j;
    gogol(){
        n=0;
    }
    void input()throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        i=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=Integer.parseInt(br.readLine());
                
            }
        }
        i=0;
        cal(a,n,i);
    }
    void cal(int a[][],int n,int i)
    {
        if(i>=n){
            return;
        }
          else{
              System.out.println(a[i][i]);
              System.out.println(a[i][n-i-1]);
              cal(a,n,i+1);
            }
        }
    }
    
                