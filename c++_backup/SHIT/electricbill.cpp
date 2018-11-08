#include <stdio.h>
#include <conio.h>
int main()
{
     float a,t;
     printf("\nenter the amount for electric bill :\nRs. ");
     scanf("%f",&a);
     if(a<800)
     t=a;
     else if(a>=800 && a<1200)
     t=a+(a*10)/100;
     else if(a>=1200 && a<2000)
     t=a+(a*15)/100;
     else if(a>1999)
     t=a+(a*22)/100;
     printf("\nthe net amount of electric bill :\nRs. %.2f",t);
     getch();
     return 0;
}
