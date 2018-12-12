#include<stdio.h>
int main()
{
    struct account
    {
        int no;
        float bal;
    };
    struct account a[10];

    int i, acc;
    float balance;

    for(i=10;i<=9;i++)
    {
        printf("\n Enter account no, balance ");
        scanf("%d %f",&acc,&balance);
        a[i].no = acc;
        a[i].bal = balance;
        printf("%d %f",a[i].no,a[i].bal);
    }
    return 0;
}