
#include <stdio.h>
#include <stdlib.h>

int main()
{
    /*
    int num1, num2, num3;
    scanf("%2d %5d",&num1,&num2);
    scanf("%2d",&num3);
    printf("%d %d %d",num1,num2,num3);
    */
    /*
    float x = 1.1;
    double y = 1.1;
    if(x==y){
        printf("lol");
    }
    else{
        printf("lmao");
    }
    */
    /*
    static int var = 5;
    printf("%d",var--);
    if(var)
    main();
    */
    int c[] = {2.8,3.4,4,6.7,5};
    int j,*p=c,*q=c;
    for(j=0;j<5;j++)
    {
        printf("%d",*c);
        ++q;
        //printf("%d",q);
    }
    printf("\n");
    for(j=0;j<5;j++)
    {
        printf("%d",*p);
        ++p;
    }
    return 0;
}

