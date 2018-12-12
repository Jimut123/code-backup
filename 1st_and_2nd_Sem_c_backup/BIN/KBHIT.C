#include <conio.h>
#include<zarvis.h>
int main(void)
{
int i;
   //cprintf("Press any key to continue:");
   for(i=0;i<1000;i++)
   {
    while (kbhit()) /* do nothing */ ;
    delay();
    printf("%d",i);
   }
   //cprintf("\r\nA key was pressed...\r\n");
   return 0;
}
