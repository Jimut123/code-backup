#include<stdio.h>
#include<conio.h>
main()
{
      char s[100];
      int i,j;
      printf("\nEnter the string :\n");
      gets(s);
      printf("\nString in alphabetical order :\n");
      for(j=65;j<=90;j++)
      for(i=0;s[i];i++)
      if((int)s[i]==j || (int)s[i]==(j+32))
      printf("%c",s[i]);
      getch();
}
