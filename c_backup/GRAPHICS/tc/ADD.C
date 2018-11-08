#include<stdio.h>
void main()
{
  int num1,num2,sum=0;
  float avg;
  clrscr();
  printf("\n ENTER TWO NUMBERS");
  scanf("%d %d",&num1,&num2);
  sum=num1+num2;
  avg=sum/(float)2; 	/* typecast */
  printf("\n The Sum of the given numbers %d and %d is %d",num1,num2,sum);
  printf("\n  Average is : %f ", avg);
  getch();
}