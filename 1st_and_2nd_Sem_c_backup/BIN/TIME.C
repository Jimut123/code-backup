
#include <time.h>
#include <stdio.h>
#include <dos.h>

int main(void)
{
   time_t t;
   int i=0,k;


   while(i==0)
   {
   t = time(NULL);
   clrscr();
   k=t%10;
   printf("%d\n",k);
   k=(((t/365)/12)/3600)/24;
   printf("%d",k);
   }
   getch();
   return 0;
}
