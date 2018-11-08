#include<stdio.h>
#include<conio.h>
void fibo(int,int,int);
main()
{
      int n;
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      int a=0,b=1;
      n=n-2;
      printf("\nFibonacci series :\n");
      printf("%d, %d, ",a,b);
      fibo(a,b,n);
      getch();
}
void fibo(int a, int b, int n)
{
     if(n==0)
     return;
     else
     {
         int c=a+b;
         printf("%d, ",c);
         fibo(b,c,--n);
     }
}
