/* TODO (#1#): important! */
/* Write a program to create an array. Print the highest and lowest number in the array. */

#include <stdio.h>
main()
{
    int val[5],hi,low,i;
    printf("\n Enter 5 integers:");
    for(i=0;i<5;i++)
    {
    printf("\nENTER VALUE-%d: ",i+1);
    scanf("%d",&val[i]);
    }
    low=val[0];
    hi=val[0];
    for(i=0;i<5;i++)
    {
    if(val[i]>hi)
    hi=val[i];
    else
    {
    if(val[i]<low)
    low=val[i];
    }
    }
    printf("\nHIGHEST VALUE IS %d",hi);
    printf("\nLOWEST VALUE IS %d",low);
}
