package iisscc;
import java.io.*;
class matrixami//declaration of class
{	public static void main(String args[])throws IOException
	{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m,n,i,j,tmp=0,k,l,s;//declaring variables
		System.out.print("enter no of rows");
		m=Integer.parseInt(br.readLine());
	    System.out.print("enter no of columns");
		n=Integer.parseInt(br.readLine());
		if((m>=2 && m<20) && (n>=2 && n<20) )
		{//validating
		}
		else
		{
			System.out.print("\nrange of  rows and col must be in betwwen 2 20");
			System.exit(0);
		}	
		int ar[][]=new int[m][n];
	for(i=0;i<m;i++)//creating the matrix
		{for(j=0;j<n;j++)
			{System.out.print("enter a no :");
		 		ar[i][j]=Integer.parseInt(br.readLine());	    
			}
		}
	System.out.print("\nElements of original matrix \n");
    for(i=0;i<m;i++)
		{for(j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
		for(k=0;k<n-1;k++)
		    		{//sorting the rows and columns
		    			for(l=0;l<n-1-k;l++)
		    			{
		    				if(ar[0][l+1]<ar[0][l])
		    				{
		    					tmp=ar[0][l];
		    					ar[0][l]=ar[0][l+1];
		    					ar[0][l+1]=tmp;
		    				}
		    			}
		    		}
		    		for(k=0;k<n-1;k++)
		    		{
		    			for(l=0;l<n-1-k;l++)
		    			{
		    				if(ar[m-1][l+1]<ar[m-1][l])
		    				{
		    					tmp=ar[m-1][l];
		    					ar[m-1][l]=ar[m-1][l+1];
		    					ar[m-1][l+1]=tmp;
		    				}
		    			}
		    		}
	                for(k=1;k<m-1;k++)
		    		{
		    			for(l=1;l<m-1-k;l++)
		    			{
		    				if(ar[l+1][0]<ar[l][0])
		    				{
		    					tmp=ar[l][0];
		    					ar[l][0]=ar[l+1][0];
		    					ar[l+1][0]=tmp;
		    				}
		    			}
		    		}
		    		for(k=1;k<m-1;k++)
		    		{
		    			for(l=1;l<m-1-k;l++)
		    			{
		    				if(ar[l+1][n-1]<ar[l][n-1])
		    				{
		    					tmp=ar[l][n-1];
		    					ar[l][n-1]=ar[l+1][n-1];
		    					ar[l+1][n-1]=tmp;
		    				}
		    			}
		    		}
    System.out.print("\nElements of matrix after sorting each outer row and col \n");
		//printing the matrix after sorting
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.print("\n\n");
		}
	s=0;
    for(i=0;i<n;i++)
			{
				s=s+ar[0][i];
				s=s+ar[m-1][i];
			}
			
			for(i=1;i<m-1;i++)
			{
				s=s+ar[i][0];
				s=s+ar[i][n-1];
			}//displaying the sum of outer row and column elements
		
			System.out.print("\n\nSum of each outer row and col :"+s);
		}//end of main
}//end of class

		