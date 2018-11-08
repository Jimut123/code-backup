#include<stdio.h>
#include<conio.h>

void range(int);
void palin(int,int);
int s;
int main()
{
      int i=1;
      printf("\nPalindrome number(s) :\n");
      range(i);
      return 0;
      getch();
}
void range(int i)
{
     if(i>100)
     return;
     else
     {
         s=0;
         palin(i,i);
         range(++i);
     }
}
void palin(int i, int j)
{
     if(i==0)
     {
             if(s==j)
             printf("\n%d,",j);
     }
     else
     {
         s=(s*10)+(i%10);
         palin(i/10,j);
     }
}

