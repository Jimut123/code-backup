//operating on square matrix
import java.util.*;
class ArrayProgram
{
   private int N;
   int list[][];
   Scanner sc=new Scanner(System.in);
   public void get()
   {
       int i,j;
       System.out.println("INPUT");
       do
       {
           System.out.println("N = ");
            N=sc.nextInt();
        }while(N<0 || N>20);
        list=new int[N][N];
        System.out.println("LIST [][]");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                do
                {
                    list[i][j]=sc.nextInt();
                }while(list[i][i]<0);
            }
        }
                System.out.println("OUTPUT");
                display();
                displayNumber();
                sort();
                System.out.println("Sorted list ");
                display();
            }
            public void display()
            {
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<N;j++)
                     System.out.print(list[i][j]+" ");
                    System.out.println();
                }
            }
            public void sort()
            {
                int k,temp;
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<N;j++)
                    {
                        for(k=j+1;k<N;k++)
                        {
                            if (list[i][j]>list[i][k])
                            {
                                temp=list[i][j];
                                list[i][j]=list[i][k];
                                list[i][k]=temp;
                            }
                        }
                    }
                }
            }
            public void displayNumber()
            {
                int max1=0,max2=0,maxi=0,maxj=0;
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<N;j++)
                    {
                        if (list[i][j]>max1)
                        {
                            max1=list[i][j];
                            maxi=i+1;
                            maxj=j+1;
                        }
                    }
                }
                System.out.println("the largest element "+max1+" is in row "+maxi+" and column "+maxj);
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<N;j++)
                    {
                        if((list[i][j]>max2) && (list[i][j]<max1))
                        {
                            max2=list[i][j];
                            maxi=i+1;
                            maxj=j+1;
                        }
                    }
                }
                System.out.println("the second largest element "+max2+" is in row "+maxi+" and column "+maxj);
            }
        }
