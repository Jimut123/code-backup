#include<stdio.h>

int main()
{
   int x,y,z;
   x=y=z=1;
   z = ++x || ++y && ++z;	
   printf("x = %d y = %d z = %d \n",x,y,z);
   return 0;
}
