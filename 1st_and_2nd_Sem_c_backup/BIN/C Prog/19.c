#include<stdio.h>
int main()
{
	int m1,m2,m3,Total;
	char Grade;
	 
	 printf("\n Enter Three Marks");
	 scanf("%d %d %d", &m1,&m2,&m3);
	 Total=m1+m2+m3;
	 
	 if(m1<=40||m2<=40||m3<=40)
		{
			Grade='f';
	    }
	if(m1<=60&&m2<=60&&m3<=60&&Total>120)
	    {
	    	Grade='o';
		}
	if(m1<=80&&m2<=80&&m3<=80&&Total>180)
	    {
	    	Grade='s';
	    }
	if(Total>240)
		{
			Grade='E';
			}    
	printf("\nm1=%d,m2=%d,m3=%d.\n",m1,m2,m3);
	printf("\nTotal=%d,Grade Is %c",Total,Grade);
	return 0;
}



