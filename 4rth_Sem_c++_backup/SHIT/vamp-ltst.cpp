#include"stdio.h"
#include"conio.h"
#include"math.h"
#include"stdlib.h"
int digcheck(int,int);
main()
{
	int a[1000],i,n,t,n1,c,d,j;
		printf("\nEnter no:\n");
	    scanf("%d",&n);
		n1=n;
		c=0;
		while(n1>0)
		{
			c++;
			n1=n1/10;
		}
		if(c%2!=0)
		{
			printf("\nError must enter number with even digits....");
			exit(0);
		}
		d=pow(10,((c/2)-1));
		//printf("\n %d",d);
		t=0;
		for(i=d;i<=(d*10)-1;i++)
		{
			if(n%i==0)
			{
				a[t++]=i;
			}
		}
		//for(i=0;i<t;i++)
		//{
			//printf("\n %d",a[i]);
		//}
		for(i=0;i<t;i++)
		{
			for(j=0;j<t;j++)
			{
				if((a[i]*a[j])==n)
				{
					if(digcheck(a[i],n)==1 && digcheck(a[j],n)==1)
					printf("\n%d * %d",a[i],a[j]);
			}
		}


}getch();
}
int digcheck(int x,int n)
	{

           int f=0;
		   int k,k1,n1;
		   while(x>0)
		   {
			   k=x%10;
			   n1=n;
			   f=0;
			   while(n1>0)
			   {
				   k1=n1%10;
				   if(k==k1)
				   {
					   f=1;
					   break;
				   }
				   
				   n1=n1/10;
			   }
			   if(f==0)
				   break;
			   x=x/10;
		   }
		   return f;
		}
