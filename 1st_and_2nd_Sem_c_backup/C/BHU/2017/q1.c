
#include <stdio.h>
#include <stdlib.h>
//#define a +01.20001 e+3
//#define b 5z1.15
//#define int char
//#define a 10
/*
#define FALSE -1
#define TRUE 1
#define NULL 0
*/
/*
int main()
{
    //printf("a  = %f ",a);
    //printf("b = %d",b);
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
    /*
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
    */
    /*
    int i=-1,j=-1,k=0,l=2,m;
    m=i++&&j++&&k++||l++;
    printf("%d%d%d%d%d",i,j,k,l,m);
    */
    //int *p;
    //int *k;
    /*
    printf("%d\n",k);
    printf("%d%d",sizeof(*p),sizeof(p));
    */
    /*
    int i =3;
    switch(i)
    {
        default:printf("zero!");
        case 3: printf("three!");
        break;
        case 1: printf("one!");
        break;
    }
    */
    //int c = - -2;
    //int i = 65;
    //printf("c=%d",c);
    //printf("sizeof(i)=%d",sizeof(i));
    /*
    int i=10;
    i=!i>14;

    printf("i=%d",i);
    */
    //printf("\nab");
    //printf("\bsi");
    //printf("\rha");
    /*
    printf("\n123");
    printf("\b456");
    printf("\r789");
    */
    //int i=5;
    //printf("%d %d %d %d %d",i++,i--,++i,--i,i);
    //#define a 50
    //printf("%d",a);
    //int i=400,j=300;
    //printf("%d..%d");
    //int i;
    //printf("%d",scanf("%d",&i));


    // 2017 Q-18 start
    /*
    int i=-1;
    -i;
    printf("i=%d,+i=%d\n",i,+i);
    *
    /*
    char *str1 = "abcd";
    char str2[] = "abcd";
    printf("%d %d %d",sizeof(str1),sizeof(str2),sizeof("abcd"));
    */
    /*
    char not;
    not =!2;
    printf("%d",not);
    */
    /*
    if(NULL)
        puts("NULL");
    else if(FALSE)
        puts("TRUE");
    else
        puts("FALSE");
    */
    /*
    if(-5)
        puts("TRUE!");
    */
    /*
    int k=1;
    printf("%d == 1 is""%s",k,k==1?"TRUE":"FALSE");
    */
    /*
    int y;
    scanf("%d",&y);
    if((y%4==0 && y%100!=0)||y%100==0)
        printf("%d is a leap year");
    else
        printf("%d is not a leap year");
    */
    /*
    int *j;
    {
        int i=10;
        j=&i;
    }
    printf("%d",*j);
    */
    /*
    register i=5;
    char j[] = "hello";
    printf("%s %d",j,i);
    */
    /*
    int i=5,j=6,z;
    printf("%d",i+++j);
    */
    /*
    int i;
    for(i=1;i<4;i++)
    {
        switch(i)
        case 1:printf("%d",i);break;
        {
            case 2:printf("%d",i);break;
            case 3:printf("%d",i);break;
        }
        switch(i) case 4:printf("%d",i);
    }
    */
    /*
    int i = _1_abc(10);
    printf("%d\n",--i);
    */

    /*
    int i=0,j=0,k=0;

    if(i++&&j++&&k++)
        printf("%d..%d lol",i++,j);
    printf("%d..%d..%d",i,j,k);
    */
    /*
    int i=0;
    while(+(+i--)!=0)
        i-=i++;
    printf("%d",i);
    */
    /*
    int i,j;
    j=(int)2.9/3;
    printf("j = %d",j);
    */
    /*
    j=0;
    for(i=0;i<=5;i=i+2/3)
    {
        j=j+1;
        printf("j = %d",j);
    }
    */

    //m,n,z: INTEGER;
    //long float tem;
    /*
    int c=0,d=5,e=10,a;
    a=c>1?d>1||e>1?100:200:300;
    printf("a = %d",a);
    */
    /*
    int j,x;
    x=0;
    for(j=0;j<=5;j++)
    {
        switch(j+1)
        {
        case 0:
        case -1:
            x+=1;
            break;
        case 1:
        case 2:
        case 3:
            x+=2;
            break;
        default:
            x+=3;
        }
        printf("%d",x);
    }
    */
    /*
    int size=5;
    int arr[5] = {1,2,3,4,5};
    for(int i=1;i<=size;i++)
    {
        if(i>3)
            break;
        else
            printf("\n%d",arr[i]);
        continue;
    }
    */
    /*
    int num1,num2;
    scanf("%2d %5d",&num1,&num2);
    printf("%d %d",num1,num2);
    */
    /*
    int num1,num2,num3;
    scanf("%d %*d %d",&num1,&num2,&num3);
    printf("%d %d",num1,num2);
    */
    // 123 456 789 112 115 118
    /*
    int n1,n2,n3,n4,n5;
    scanf("%d %*d %d, %d %d",&n1,&n2,&n3,&n4,&n5);
    printf("%d %d %d %d %d",n1,n2,n3,n4,n5);
    */
    /*
    int a,val=7,k;
    //float b;
    //char name[30];
    //val = scanf("%d %f %s",&a,&b,name);
    k = printf("%d",val);
    printf("%d",k);
    */
    //int k;
    //int i;
    //printf("%06d",9876);

    //int x,y,z;
    //z = (x=10, y=5, x+y++);
    //z = (x=100,y = 6);

    //printf("%d",z);
    /*
    int a[5] = {1,2,3,4,5};
    printf("%d\n",*(a+4));
    printf("%d\n",a[4]);

    return 0;

}
*/
/*
int _1_abc(int i)
{
    return (i++);
}
*/
