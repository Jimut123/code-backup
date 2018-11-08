import java.io.*;
class matrix_mn
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n,p,m,j;
System.out.print("Enter matrix elements");
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
for(i=0;i<m;i++)
 {for(j=0;j<n;j++)
   a[i][j]=Integer.parseInt(br.readLine());
}
for(i=0;i<m;i++)
 {for(j=0;j<n;j++)
    System.out.print(a[i][j]+" " );
    System.out.println("");
}

}
}