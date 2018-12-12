#include"stdio.h"
#include"conio.h"
void main()
{
     int P,R,T,SI,A;
     printf("\n ENTER DATA");
     scanf("%d", &P);
     scanf("%d", &R);
     scanf("%d", &T);
     A=P*R*T;
     SI=A/100;
     printf("\n  AMT is: %d",A);
     printf("\n INTRST is: %d",SI);
     getch();
     }
     
