#include<stdio.h>
#include<conio.h>

void range(int);
void prime(int,int);

int main()
{
      int i=1;
      printf("\nPrime number(s) :\n");
      range(i);
      return 0;
      getch();
}
void range(int i)
{
    int j;
     if(i>100)
     return;
     else
     {
         j=2;
         prime(i,2);
         range(++i);
     }
}
void prime(int i, int j)
{
     if(j>=i)
     printf("\n%d,",i);
     else
     {
         if(i%j==0)
            return;
         else
         prime(i,++j);
     }
}

