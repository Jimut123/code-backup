	/* Write a program to create an array of students ages.
	   Print the average age. */
#include <stdio.h>
main()
{
int age[10],i,sum=0 ;
float avg;
for(i=0;i<5;i++)
{
printf("\nENTER AGE-%d: ",i+1);
scanf("%d",&age[i]);
sum=sum+age[i];
}
printf("\nINPUT AGES ARE: ");
for(i=0;i<5;i++)
printf("%d ",age[i]);
avg=sum/(float)5;
printf("\nTHE AVERAGE AGE IS: %0.2f",avg);
}
