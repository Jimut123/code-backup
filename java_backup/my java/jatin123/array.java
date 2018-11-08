import java.io.*;
class array
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][];
        array()throws IOException
            {
                int n,i,j,s,s1;
                System.out.println("Enter term:");
                n=Integer.parseInt(br.readLine());
                a=new int[n][n];
                i=0;
                rec1(a,i,n);
                i=0;
                j=0;
                s=s1=0;
                diag(a,i,n,s,s1);
            }
            void rec1(int a[][],int i,int n)throws IOException
            {
                
                if(i>=n)
                return ;
                else
                {
                    int j=0;
                    rec2(a,i,j,n);
                    rec1(a,i+1,n);
                }
            }
            void rec2(int a[][],int i,int j,int n)throws IOException
            {
                if(j>=n)
                return ;
                else
                {
                    a[i][j]=Integer.parseInt(br.readLine());
                    rec2(a,i,j+1,n);
                }
            }
            void diag(int a[][],int i,int n,int s,int s1)
            {
                if(i>=n)
                {
                    System.out.println("Sum of left:"+s+","+"Sum of right:"+s1+","+"Sum of diagonal:"+(s+s1));
                    //System.out.println(s1);
                return;
            }
                else
                {
                    s=s+a[i][i];
                    s1=s1+a[i][n-i-1];
                    diag(a,i+1,n,s,s1);
                }
            }
        }
                    
                
            
                    
            
                
            