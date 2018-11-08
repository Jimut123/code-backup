#include<stdio.h>
#include<conio.h>
main()
{
      char s[100];
      printf("\nEnter the name :\n");
      gets(s);
      int i,j,c=0;
      printf("\nFrequency of each character :\n");
      for(i=0;s[i];i++)
      {
       c=0;
       for(j=0;s[j];j++)
        if(s[i]==s[j])
         c++;
       printf("\n%c - %d",s[i],c);
      }
      getch();
}
