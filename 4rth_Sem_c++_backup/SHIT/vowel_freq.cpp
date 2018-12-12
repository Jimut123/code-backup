#include<stdio.h>
#include<conio.h>
main()
{
      char s[100];
      printf("\nEnter the name :\n");
      gets(s);
      int i,j,c=0;
      printf("\nFrequency of each vowel :\n");
      for(i=0;s[i];i++)
      {
       c=0;
       if(s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U' || s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
       {
        for(j=0;s[j];j++)
        if(s[i]==s[j])
         c++;
        printf("\n%c - %d",s[i],c);
       }
      }
      getch();
}
