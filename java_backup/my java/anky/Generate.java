import java.io.*;
class Generate
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,s,m,n,k,t,arr[][];
    void input()
    {
        System.out.println("Enter size");
        s=Integer.parseInt(br.readLine());
        int arr[][]=new int[s][s];
    }
    void fill()
    {
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                System.out.println("Enter 1 or 0");
                arr[i][j]=Intger.parseInt(br.readLine());
            }
        }
    }
    