/**********************************************************
 Statement - Use structure within union
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/


#include<stdio.h>
#include<conio.h>

void main() {
    struct student {
        char name[30];
        char sex;
        int rollno;
        float percentage;
    };
    
    union details {
        struct student st;
    };
    union details set;
    clrscr();
    
    
    printf("Enter details:");
    
    printf("\nEnter name : ");
    scanf("%s", set.st.name);
    printf("\nEnter roll no : ");
    scanf("%d", &set.st.rollno);
    
    flushall();
    
    printf("\nEnter sex : ");
    scanf("%c", &set.st.sex);
    printf("\nEnter percentage :");
    scanf("%f", &set.st.percentage);
    
    printf("\nThe student details are : \n");
    printf("\name : %s", set.st.name);
    printf("\nRollno : %d", set.st.rollno);
    printf("\nSex : %c", set.st.sex);
    printf("\nPercentage : %f", set.st.percentage);
    
    getch();
}