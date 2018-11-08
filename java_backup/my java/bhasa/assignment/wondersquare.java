package assignment;

import java.io.*;
class wondersquare
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double row,srow,scol,f,f1;
        srow=scol=f=f1=0;
        System.out.println("ENTER ROW AND COLOUMN DIMENSION");
        int n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        int i,j;
        System.out.println("ENTER MATRIX ELEMENTS");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("ENTER ELEMENT FOR POSITION ("+i+","+j+")");
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        row=0.5*n*((n*n)+1);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                srow++;
            }
            if(srow==row)
            {
                f=1;
            }
            else
            {
                f=0;
                break;
            }
            srow=0;
        }
        if(f==0)
        {
            System.out.println("NOT A WONDER SQUARE");
        }
        else
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    scol++;
                }
                if(scol==row)
                {
                    f1=1;
                }
                else
                {
                    f1=0;
                    break;
                }
                scol=0;
            }
        }
        if(f1==1 && f==1)
        {
            System.out.println("WONDER SQUARE");
        }
        if(f1==0 && f==0)
            {
                System.out.println("");
            }
        if(f==1 && f1==0)
        {
            System.out.println("NOT A WONDER SQUARE");
        }
    }
}
