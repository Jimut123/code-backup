#include<stdio.h>
main()
{
	int pos,num,i,a[10]={10,20,40,50,60,70};
	scanf("%d",&num);
	scanf("%d",&pos);
	for(i=6;i>=pos+1;i--)
		a[i]=a[i-1];
	a[pos]=num;
	printf("\nsucessfully added!!");
	for(i=0;i<=6;i++)
		printf("\n%d ",a[i]);
	
}
