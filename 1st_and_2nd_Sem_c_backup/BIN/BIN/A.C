/******************************** To find the max and min nos.**************
********************************* by -- JIMUT BAHAN PAL ********************
***************************************************************************/
#include<stdio.h>
void main()
{
int n[10],max,min,i;
clrscr();
printf("Enter the 10 numbers ::\n"); // taking the numbers
for(i=0;i<10;i++)
{
printf("Enter the %d number element ::",i+1);// taking input from the user
scanf("%d",&n[i]);
}
max=n[0];     //initialising the max value to the 1st number in the array
min=n[0];     //initialising the min value to the 2nd number in the array
for(i=0;i<10;i++)
{
if(n[i]>=max)             //checking and finding the max value
max=n[i];
else if(n[i]<=min)        // checking and finding the min value
min=n[i];
}
printf("The Max and min values are %d and %d",max,min);
getch();
}