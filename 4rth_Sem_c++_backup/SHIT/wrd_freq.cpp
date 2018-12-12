#include <stdio.h>
#include <conio.h>
#include <string.h>
void freq(char[],char[],int);
main()
{
      char s[100],w[100];
      printf("\nEnter the sentence : \n");
      gets(s);
      int n=strlen(s);
      s[n++]=' ';
      s[n]='\0';
      printf("\nEnter the word : \n");
      gets(w);
      freq(s,w,n);
      getch();
}
void freq(char s[], char w[], int n)
{
     int i,j,t=0,c=0;
     char wd[100];
     for(i=0;s[i];i++)
     {
     if(s[i]==' ')
     {
      if(stricmp(wd,w)==0)
      c++;
      for(j=0;wd[j];j++)
      wd[j]=' ';
      t=0;
     }
     else
     wd[t++]=s[i];
     }
     if(c>0)
     printf("\nThe given word was found %d time(s)...",c);
     else
     printf("\nThe given word was not found!!!!!!!!!");
}
