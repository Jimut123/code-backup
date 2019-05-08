#include<stdio.h>
#include<"file1.h">

extern int x,y,z;

void main()
{
    func1();
    printf("%d %d %d\n",x,y,z);
    func2();
    func3();
    func3();
    func4();
    printf("%d %d %d\n",x,y,z);
}

void func3()
{
    static int b;
    y++;b++;
    printf("%d %d %d %d\n",x,y,z,b);
}

void func4()
{

    int x,y,z;

    x=10;
    y=20;
    z=30;
    printf("%d %d %d\n",x,y,z);
}


