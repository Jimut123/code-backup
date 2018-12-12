#include<stdio.h>
int main()
{
float s,a,b,c;
printf("Enter a,b,c: );
scanf("%f %f %f",&a,&b,&c);

s=(a+b+c)/2;
area=s*(s-a)*(s-b)*(s-c);

printf("Area of Triangle: ",area);
return 0;
}
