#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main()
{
      int i,j,n,f=0;
      char *s;      
      printf("\nEnter the limit :\n");
      scanf("%d",&n);
      fflush(stdin);
      s=(char*)malloc(n*sizeof(char));
      printf("\nEnter the string :\n");
      gets(s);
      printf("\n\nThe string :\n");
      for(i=0;i<n;i++)
      printf("%c",*(s+i));
      
      for(i=0,j=n-1;i<n/2;i++,j--)
      if(*(s+i)!=*(s+j))
      {
       f=1;
       break;
      }
      if(f==0)
      printf("\n\nThe string is palindrome.....\n");
      else
      printf("\n\nThe string is not palindrome!!!!!!!\n");
      getch();
}
