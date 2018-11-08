#include<stdio.h>
#include<conio.h>
main()
{
      char s1[100],s2[100];
      int i,j,f=0;
      printf("\nEnter first string :\n");
      gets(s1);
      printf("\nEnter second string :\n");
      gets(s2);
      printf("\nComparing the string :\n");
      for(i=0;s1[i];i++)
      if(s1[i]!=s2[i])
      {
       f=1;
       break;
      }
      if(f==0)
      printf("\nThe strings are equal!!!!");
      else
      printf("\nThe string are unequal!!!!!!!!!!!!!!");
      getch();
}
