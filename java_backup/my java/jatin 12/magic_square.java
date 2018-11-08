    import java.io.*; 
    class magic_square
    {//declaration of class
        public static void main()throws IOException
        {//declaration of main
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            int i,j,p,r,m,f=0,sum,s=0;//inisialisation of variables
            System.out.println("Enter no.of rows of magic square");
            r=Integer.parseInt(br.readLine());//taking input         
            System.out.println("Enter no.of columns of magic square");
            m=Integer.parseInt(br.readLine());//taking input
            p=r;
            int a[][]=new int[p][m];
            System.out.println("Enter elements");
            for (i=0;i<p;i++)
            {//to enter elements in an array
                for (j=0;j<m;j++)
                a[i][j]=Integer.parseInt(br.readLine());
            }//end of loop
            if (r!=m)
            {//cheching if array is a square or not
                System.out.println("Not a Magic Square");
                System.exit(1);
            }//end of loop
            for (i=0;i<p;i++)
            {//printing the array
                for (j=0;j<p;j++) 
                System.out.print(" "+a[i][j]);
                System.out.println();
            }//end of loop
            for (i=0,j=0;j<p;j++)
            s+=a[i][j];//adding up elements in first row
            sum=s;
            for (i=0;i<p;i++)
            {//adding  up elements of each row and checking if they are equal or not
                for (s=0,j=0;j<p;j++)
                s+=a[i][j];
                if (s!=sum)
                { 
                    f=7;
                    break;
                }
            }//end of loop
            for (j=0;j<p;j++)
            {//adding  up elements of each column and checking if they are equal or not
                for (s=0,i=0;i<p;i++)
                s+=a[i][j];
                if (s!=sum)
                { 
                    f=7;
                    break;
                }
            }//end of loop
            for (s=0,i=0,j=0;j<p;j++,i++)
            s+=a[i][j];//adding up elements in the left diagonal
            if (s!=sum)
            f=7;
            for (s=0,i=p-1,j=0;j<p;j++,i--)
            s+=a[i][j];//adding up elements in the right diagonal
            if (s!=sum)
            f=7;
            if (f!=7)//checking whether magic square or not
            System.out.println("Magic Square");
            else
            System.out.println("Not a Magic Square");
        }//end of main
    }//end of class
