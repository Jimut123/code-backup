import java.io.*;
class matrix_multiplication 
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the no.of rows and columns for the 1st matix");
 int r1=Integer.parseInt(br.readLine());
 int c1=Integer.parseInt(br.readLine());
 System.out.println("Enter the no.of rows and columns for the 2nd matix");
 int r2=Integer.parseInt(br.readLine());
 int c2=Integer.parseInt(br.readLine());
 int a[][]=new int[r1][c1];
 int b[][]=new int[r2][c2];
 int c[][]=new int[r1][c2];
 int i,j,k;
 do
{

 if(c1!=r2)
 {
 System.out.println("No.of rows in 1st column has to be equal to no. of rows of2nd...enter again");
                     
  }
}while(c1!=r2);
while(c1!=r1)
{
//create first arrary
for(i=0;i<r1;i++)
   {
      for(j=0;j<c1;j++)
       {
          System.out.println("Enter data for"+(r1+1)+"row and"+(c1+1)+"column");
          a[i][j]=Integer.parseInt(br.readLine());
        }
    }
    //create second array
    for(i=0;i<r2;i++)
    {
        for(j=0;j<c2;j++)
        {
          System.out.println("Enter data for"+(r2+1)+"row and"+(c2+1)+"column");
          b[i][j]=Integer.parseInt(br.readLine());
        }
    }
    //multiplication
    for(i=0;i<r1;i++)
    {
        for(j=0;j<c2;j++)
        {
            c[i][j]=0;
        
        for(k=1;k<c2;k++)
        {
          c[i][j]=a[i][k]*b[k][j];
        }
    }
}
}

    //print 1st array
for(i=0;i<r1;i++)
   {
      for(j=0;j<c1;j++)
       {
          System.out.println(a[i][j]+"\t");
        }
        System.out.println( );
    }
//print 2nd array
for(i=0;i<r2;i++)
    {
        for( j=0;j<c2;j++)
        {
          System.out.println(b[i][j]+"\t");
          
        }
    System.out.println();
}
//print multiplied array
for( i=0;i<r1;i++)
    {
        for( j=0;j<c2;j++)
        {
            System.out.println(c[i][j]+"\t");
        }
        System.out.println();
    }
}
}


        
          

