#include<stdio.h>
main()
{
 int x=1,y=1;
  for(;;)
  {
 if(x>5)
 break;
 else
 y=y+1;
 printf("\n %d",y);
 x+=y;
 }
}
