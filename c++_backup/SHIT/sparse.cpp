#include<stdio.h>
#include<conio.h>

int main()
{
	int a[100][100],b[100][100],n,i,j=0,k,r=0,h=0;
	
	printf("enter length of array");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		printf("enter elements");
		scanf("%d",&a[i][j]);
	}
	}
	
	for(i=0;i<n;i++)
	{
	  for(j=0;j<n;j++)
	  {
	  	if(a[i][j]==0)
	
		  {
		  	h++;
		  }
	  	else
	  	{
	  		r++;
	  		
	  		
	  		
	  		
		  }
	  }
	}
	
	if(h>((n*n)/2.0))
	
	  printf("\n sparse matrix");
	  else
	  printf("\n not sparse");
	   
	   
	   b[0][0]=n;
	   b[0][1]=n;
	   b[0][2]=r;
	   k=1;
	   
	   
	   for(i=0;i<n;i++)
	   {
	   	 for(j=0;j<n;j++)
	   	 {
	   	 	if(a[i][j]!=0)
	   	 	{
	   	 		b[k][0]=i;
	   	 		b[k][1]=j;
	   	 		b[k][2]=a[i][j];
	   	 		k++;
				}
			}
			
	   }


       
    printf("\n");
    for(i=0;i<k;i++)
    {
    	for(j=0;j<3;j++)
    	{   
    		printf(" %d",b[i][j]);
		}
		printf("\n");
	}
	
	
	getch();
	return 0;
	
}



