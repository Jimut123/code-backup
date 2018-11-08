#include<stdio.h>
int main()
{
	int m=3,n=2;						//m_no of rows, n_no of columns
	int a[m][n],b[m][n],c[m][n];
	int i,j;
	
	for(i=0;i<m;i++)				//reading the values of rows and columns
		for(j=0;j<n;j++)
			printf("\n Enter the elements of matrices a and b row-wise: ");
			printf("\n In the format a[i][j],b[i][j]...");
			scanf("%d, %d ",&a[i][j],&b[i][j]);
			
	printf("\n The matrix a as entered is...\n");
	for(i=0;i<m;i++)				//printing the matrix a[][]
	{
		for(j=0;j<n;j++)
			printf("%4d",a[i][j]);
			printf("\n");
	}
	
	printf("\n The matrix b as entered is...\n");		
	for(i=0;i<m;i++)				//printing the matrix b[][]
	{
		for(j=0;j<n;j++)
			printf("%4d",b[i][j]);
			printf("\n");
	}
	
	for(i=0;i<m;i++)				//addition operation
	{	for(j=0;j<n;j++)
			c[i][j]=a[i][j]+b[i][j];
	}
	
	printf("\n The matrix c as a sum of a and b is...\n");
	for(i=0;i<m;i++)				
	{
			for(j=0;j<n;j++)
				printf("%4d",c[i][j]);
				printf("\n");
	}
		
	return 0;
}
			
		
				
	
	

