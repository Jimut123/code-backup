#include<stdio.h>
#include"conio.h"
int main()
{
    int a,b,D,R;
    printf("\n give values:");
    scanf("%d",&a);
    scanf("%d",&b);
    D=a/b;
    printf("\n%d",D);
    R=a%b;
    printf("\n%d",R);
    getchar();
    return 0;
}
