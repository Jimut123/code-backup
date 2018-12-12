#include<stdio.h>

/*main()
{
	int i,x,n,k=1;
	scanf("%d %d",&x,&n);
	
	for(i=1;i<=n;i++)
	{
		k=k*x;
	}
*/
int main()
{
	int x,n,y;
	scanf("%d %d",&x,&n);
	y=pow(x,n);
	printf("\n %d",y);
}
