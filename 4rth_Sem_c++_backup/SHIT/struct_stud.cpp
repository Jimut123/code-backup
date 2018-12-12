#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
       char name[100];
       int roll;
       char class1[3];
       char sec[100];
};
struct marks
{
       int m1,m2,m3,tot;
};
main()
{
     struct student s[100];
     struct marks m[100];
     int t=0,c=1;
     do
     {
         fflush(stdin);
         printf("\nEnter name :\n");
         gets(s[t].name);
         printf("\nEnter roll no. :\n");
         scanf("%d",&s[t].roll);
         fflush(stdin);
         printf("\nEnter class :\n");
         gets(s[t].class1);
         printf("\nEnter section :\n");
         gets(s[t].sec);
         printf("\nEnter marks1 :\n");
         scanf("%d",&m[t].m1);
         printf("\nEnter marks2 :\n");
         scanf("%d",&m[t].m2);
         printf("\nEnter marks3 :\n");
         scanf("%d",&m[t].m3);
         m[t].tot=m[t].m1+m[t].m2+m[t].m3;
         t++;
         printf("\nWant to enter more?(yes=1/no=0) :\n");
         scanf("%d",&c);
     }while(c==1);
     int i,j;
     struct student k1;
     struct marks k2;
     for(i=0;i<t;i++)
     for(j=0;j<t-i-1;j++)
     if(m[j].tot<m[j+1].tot)
     {
      k1=s[j];
      s[j]=s[j+1];
      s[j+1]=k1;
      k2=m[j];
      m[j]=m[j+1];
      m[j+1]=k2;
     }
     printf("\nList of students according to descending order of their total marks : ");
     for(i=0;i<t;i++)
     printf("\n\nName : %s\nRoll : %d\nClass : %s\nSection : %s\nMarks1 : %d\nMarks2 : %d\nMarks3 : %d\nTotal : %d",s[i].name,s[i].roll,s[i].class1,s[i].sec,m[i].m1,m[i].m2,m[i].m3,m[i].tot);
     getch();
}
