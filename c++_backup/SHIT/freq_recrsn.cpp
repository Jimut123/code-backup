#include<stdio.h>
#include<conio.h>

void func1(int);
int func2(int,int,int);

int a[100],n,i,j,max=0,min=100;
main()
{
      printf("\nEnter the array limit :\n");
      scanf("%d",&n);
      printf("\nEnter the array elements :\n");
      for(i=0;i<n;i++)
      scanf("%d",&a[i]);
      printf("\nYour array :\n");
      for(i=0;i<n;i++)
      printf("%d, ",a[i]);
      i=j=0;
      printf("\n");
      func1(i);
      getch();
}
void func1(int i)
{
     if(i==n)
     {
             printf("\nMax freq : %d \nMin freq : %d\n",max,min);
             return;
     }
     else
     {
         int c=0;
         j=0;
         if(func2(i,j,c)>max)
         max=func2(i,j,c);
         if(func2(i,j,c)<min)
         min=func2(i,j,c);
         func1(++i);
     }
}
int func2(int i, int j, int c)
{
     if(j==n)
     return c;
     else
     {
         if(a[i]==a[j])
         c++;
         return func2(i,++j,c);
     }
}
