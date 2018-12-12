/*************************** FIBONACCI SERIES *****************************
**************************** by-JIMUT BAHAN PAL ***************************
***************************************************************************/
#include<stdio.h>
void main()
{
int a[10],i;
clrscr();
a[0]=0;                    //initialising the 1st two variables of he array
a[1]=1;
printf("%d %d",a[0],a[1]); //printing the 1st two variables
for(i=2;i<10;i++)
{
a[i]=a[i-1]+a[i-2];      /* a short form of calculating the series along
			  with printing it  */
printf(" %d ",a[i]);
}
getch();
}