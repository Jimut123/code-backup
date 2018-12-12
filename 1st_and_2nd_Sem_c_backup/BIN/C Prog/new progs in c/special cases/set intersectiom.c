#include<stdio.h>
main()
{
	int s1[5],s2[5],s[10];
	int i,j,flag=0,count=0;
	printf("enter the no of s1: ");
	for(i=0;i<=4;i++)
	scanf("%d",&s1[i]);
	printf("enter the no of s2: ");
	for(i=0;i<=4;i++)
	scanf("%d",&s2[i]);
	for(i=0;i<5;i++)
	{
		flag=0;
		for(j=0;j<5;j++)
		{
			if(s2[j]==s1[i])
			flag=1;
		}
		if(flag==1)
		{
		s[count]=s1[i];
		count++;
		}
	}
	
	for(i=0;i<count;i++)
	printf("%d ",s[i]);
}
