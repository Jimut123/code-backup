#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
       int roll;
       char name[100];
       char class1[3];
       int marks;
       float avg;
};
main()
{
     struct student s[100];
     int t=0,c=1;
     do
     {
         printf("\nEnter roll no. :\n");
         scanf("%d",&s[t].roll);
         fflush(stdin);
         printf("\nEnter name :\n");
         gets(s[t].name);
         printf("\nEnter class :\n");
         gets(s[t].class1);
         printf("\nEnter marks :\n");
         scanf("%d",&s[t].marks);
         printf("\nEnter average :\n");
         scanf("%f",&s[t].avg);
         t++;
         printf("\nWant to enter more?(yes=1/no=0) :\n");
         scanf("%d",&c);
     }while(c==1);
     int i,j;
     struct student k;
     for(i=0;i<t;i++)
     {
     for(j=0;j<t-i-1;j++)
     {
     if(s[j].marks<s[j+1].marks)
     {
      k=s[j];
      s[j]=s[j+1];
      s[j+1]=k;
      }
      }
      }
     for(i=0;i<t;i++)
     {
     printf("\n %d",s[i].roll);
      printf("\n %s",s[i].name);
       printf("\n %s",s[i].class1);
        printf("\n %d",s[i].marks);
         printf("\n %.2f",s[i].avg);
         }
      
     
     getch();
     return 0;
}
