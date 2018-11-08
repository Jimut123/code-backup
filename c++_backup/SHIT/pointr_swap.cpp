#include<stdio.h>
#include<conio.h>
main()
{
      int a,b,*c,*d;
      printf("\nEnter the value of 'a' :\n");
      scanf("%d",&a);
      printf("\nEnter the value of 'b' :\n");
      scanf("%d",&b);
      c=&a;
      d=&b;
      printf("\n\nThe value of 'c' :\n");
      printf("%d",c);
      printf("\n\nThe value of 'd' :\n");
      printf("%d",d);
      printf("\n\nThe value of 'a' :\n");
      printf("%d",a);
      printf("\n\nThe value of 'b' :\n");
      printf("%d",b);
      int t=*c;
      *c=*d;
      *d=t;
      printf("\n\nThe value of 'c' :\n");
      printf("%d",c);
      printf("\n\nThe value of 'd' :\n");
      printf("%d",d);
      printf("\n\nThe value of 'a' :\n");
      printf("%d",a);
      printf("\n\nThe value of 'b' :\n");
      printf("%d",b);
      printf("\n\nThe value of 'a' through pointer 'c' :\n");
      printf("%d",*c);
      printf("\n\nThe value of 'b' through pointer 'd' :\n");
      printf("%d",*d);
      getch();
}
