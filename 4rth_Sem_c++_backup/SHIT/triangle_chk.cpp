#include <stdio.h>
#include <conio.h>
void main()
{
     float a,b,c;
     printf("\nenter the sides of a triangle :\n");
     scanf("%f %f %f",&a,&b,&c);
     if(a==b && b==c)
     printf("\nequilateral triangle.... ");
     else if(a==b && a!=c && b!=c)
     printf("\nisosceles triangle.... ");
     else
     printf("\nscalene triangle.... ");
     getch();
}
