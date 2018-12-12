	/*q11as1.c : Write a program to calculate
	s=(1)+(1+2)+...+(1+2+...+n)*/
/*	#include<stdio.h>
//	void main()
	int main()
	{
	int s,s1;
	int n,c;
//	clrscr();
	printf("\nEnter n :");
	scanf("%d",&n);
	s=s1=0; /* s=(1)+(1+2)+...+(1+2+...+n),  s1=(1), s1=(1+2),
		s1=(1+2+3)..... */
/*	for(c=1;c<=n;c=c+1)
	{
	s1=s1+c;
	s=s+s1;
	}
	printf("\nSum of %d numbers=%d\n",n,s);
//	getch();
return 0;
	}*/
#include<stdio.h>
int main()
{
	int i,j,n,sum=0;
	printf("\nEnter no of terms, n: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=0;j<i;j++)
		{
		sum=sum+i*(n-j);
		}
	}
	printf("\nSum=%d",sum);
	return 0;
}

