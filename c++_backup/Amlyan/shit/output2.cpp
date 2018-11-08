#include<stdio.h>
int main()
{
    int a, b = 10;
    a = b---;
    printf("a = %d, b = %d", a, b);
    return 0;
}
