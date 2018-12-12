#include"stdio.h"
#include"conio.h"
void main()
{
     int i;
     printf("\n Enter Year:");
     scanf("%d",&i);
     if(i%4==0 || i%400==0)
      printf("\n Leap Year....");
      else
       printf("\n Non Leap Year....");
       getch();
       }
