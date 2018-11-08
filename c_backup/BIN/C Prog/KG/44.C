/* Write a program to create an array.
Compute the Mean, Variance & Standard Deviation of the array. */
/* Note: - To use the sqrt() function <math.h> header file must be included.*/

#include <stdio.h>
#include <math.h>
main()
{
int a[10],i,n=5;
float mean,temp,var,sd,sum=0.0;
for(i=0;i<n;i++)
{
printf("\nENTER NUMBER-%d: ",i+1);
scanf("%d",&a[i]);
sum=sum+a[i];
}
mean=sum/n;
for(i=0;i<n;i++)
{
temp=a[i]-mean;
sum=sum+(temp*temp);
}
var=sum/n;
sd=sqrt(var);
printf("\nMEAN = %0.2f",mean);
printf("\nVARIANCE = %0.2f",var);
printf("\nSTANDARD DEVIATION = %0.2f",sd);
}
