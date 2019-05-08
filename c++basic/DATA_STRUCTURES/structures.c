#include<stdio.h>
typedef struct {
    char first[10];
    char midinit;
    char last[20];
} NAMETYPE;

void enter_name(struct NAMETYPE *name)
{
    printf("\nEnter the first name = ");
    scanf("%s",&(*name->first));
    printf("\nEnter the middle initial = ");
    scanf("%s",&name->midinit);
    printf("\nEnter the last name = ");
    scanf("%s",&name->last);
}

void disp_name(NAMETYPE *name)
{

    printf("First Name : %s",name->first);
    printf("Middle Name : %s",name->midinit);
    printf("Last name : %s",name->last);

    //printf("%s %s %s",name.first,name.midinit,name.last);

}
int main()
{
    NAMETYPE sname,ename;
    enter_name(&sname);
    disp_name(&sname);
}
