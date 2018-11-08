#include"stdio.h"
#include"conio.h"
void main()
{
     float P,C,M,B,CS,A;
     printf("ENTER YOUR MARKS");
     scanf("%f",&P);
     scanf("%f",&C);
     scanf("%f",&M);
     scanf("%f",&B);
     scanf("%f",&CS);
     A=(P+C+M+B+CS)/5;
     printf("YOUR AVG");
     printf("\n %.2f ",A);
     if(A>0&&A<30)
     printf("GRADE OBTAINED F");
     else if(A>30&&A<50)
     printf("GRADE OBTAINED P");
     else if(A>50&&A<75)
     printf("GRADE OBTAINED G"); 
     else if(A>75&&A<=90)
     printf("GRADE OBTAINED A");
     else if(A>90)
     printf("CONGRATS YOU HAVE TOPPED THE CLASS GRADE OBTAINED A++");
     getch();
     }
     
