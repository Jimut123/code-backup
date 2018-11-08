#include<stdio.h>
struct abc
{
char nm[100];
int x;
float y;
};
void main()
{
struct abc c[100];
int j;
clrscr();
for(j=0;j<3;j++)
{
printf("Enter the %d number of element :",j+1);
gets(c[j].nm);
scanf("%d",&c[j].x);
scanf("%d",&c[j].y);
}
for(j=0;j<10;j++)
{
printf("The %d number of element :",j+1);
puts(c[j].nm);
printf("%d",&c[j].x);
printf("%d",&c[j].y);
}

getch();
}

