#include<stdio.h>
int main()
{
    int i = 54;
    float a = 3.14;
    int *ii;
    float *aa;
    ii = &i;
    aa = &a;
    printf("\n address in ii = %u",ii);
    printf("\n address in aa = %u",aa);
    printf("\n value at address contained in ii = %d",*ii);
    printf("\n value at address contained in aa = %f",*aa);
    return 0;
}