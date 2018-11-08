#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
//char* bsort(char**,int);
main()
{
      char* s[100];
      int i,j,n;
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      printf("\nEnter the strings :\n");
      for(i=0;i<n;i++)
      {
       *(s+i)=(char*)malloc(10*sizeof(char));
       fflush(stdin);
       gets(*(s+i));
      }
      printf("\n\nThe unsorted strings :");
      for(i=0;i<n;i++)
      printf("\n%s",*(s+i));
      /*for(i=0;i<n;i++)
      *(s+i)=bsort(s+i,n);*/
      char a[100];
      for(i=0;i<n;i++)
      for(j=0;j<n-i-1;j++)
      if(stricmp(*(s+j),*(s+j+1))>0)
      {
       strcpy(a,*(s+j));
       strcpy(*(s+j),*(s+j+1));
       strcpy(*(s+j+1),a);
      }
      
      printf("\n\nThe sorted strings :");
      for(i=0;i<n;i++)
      printf("\n%s",*(s+i));
      getch();
}
/*char* bsort(char* b, int n)
{
     int i,j;
     char a[100];
     for(i=0;i<n;i++)
     for(j=0;j<n-i-1;j++)
     if(stricmp(*(*(b+j)),*(*(b+j+1)))>0)
     {
      strcpy(a,*(*(b+j)));
      strcpy(*(*(b+j)),*(*(b+j+1)));
      strcpy(*(*(b+j+1)),a);
     }
     return **b;
     
}
*/
