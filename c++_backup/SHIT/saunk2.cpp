#include<stdio.h>
#include"conio.h"
int main()
{
    int p,r,t,s;
    printf("\n give values:");
    scanf("%d",&p);
    scanf("%d",&r);
    scanf("%d",&t);
    s=(p*r*t)/100;
    printf("\n%d",s);
    getchar();
    return 0;
}
