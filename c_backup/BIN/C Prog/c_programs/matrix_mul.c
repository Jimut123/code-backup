//matrix multiplication
#include<stdio.h>
int main()
{
	int i,j,k,n,sum=0,a[10][10],b[10][10],c[10][10];
	printf("\nEnter the degree of the matrix: ");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			printf("\nEnter number a[%d][%d]= ",i,j);
			scanf("%d",&a[i][j]);
		}
		for(i=0;i<n;i++){
		for(j=0;j<n;j++)
		{
			//printf("\nFirst matrix is as follows: ");
			printf("%5d",a[i][j]);
		}
		printf("\n");
	}
		
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		{
			printf("\nEnter number b[%d][%d]= ",i,j);
			scanf("%d",&b[i][j]);
		}
			for(i=0;i<n;i++){
		for(j=0;j<n;j++)
		{
			//printf("\nSecond matrix is as follows: ");
			printf("%5d",b[i][j]);
		}
		printf("\n");
	}
		
	for(i=0;i<n;i++)

		for(j=0;j<n;j++)
		{
			sum=0;
			for(k=0;k<n;k++){
			sum=sum+ a[i][k]*b[k][j];
		}
		c[i][j]=sum;
	}
	printf("\nRequired matrix is as follows: ");
	for(i=0;i<n;i++)	
		for(j=0;j<n;j++)
		{
			printf("\t%5d",c[i][j]);
			printf("\n");
		}
	
return 0;	
}
