#include <stdio.h>
#include <conio.h>
#include <string.h>
void max_wd(char[],int);
void min_wd(char[],int);
main()
{
      char s[100];
      printf("\nEnter the sentence : \n");
      gets(s);
      int n=strlen(s);
      s[n++]=' ';
      s[n]='\0';
      max_wd(s,n);
      min_wd(s,n);
      getch();
}
void max_wd(char s[], int n)
{
     int i,j,t=0,max=0;
     char w[100];
     for(i=0;s[i];i++)
     {
     if(s[i]==' ')
     {
      if(strlen(w)>max)
      max=strlen(w);
      for(j=0;w[j];j++)
      w[j]=' ';
      t=0;
     }
     else
     w[t++]=s[i];
     }
    
     printf("\n\nLargest word(s) :\n");
     for(i=0;s[i];i++)
     {
     if(s[i]==' ')
     {
      if(strlen(w)==max)
      printf("%s\n",w);
      for(j=0;w[j];j++)
      w[j]=' ';
      t=0;
     }
     else
     {
     w[t++]=s[i];
     w[t]='\0';
     }
     }
}
void min_wd(char s[], int n)
{
     int i,j,t=0,min=100;
     char w[100];
     for(i=0;s[i];i++)
     {
     if(s[i]==' ')
     {
      if(strlen(w)<min)
      min=strlen(w);
      for(j=0;w[j];j++)
      w[j]=' ';
      t=0;
     }
     else
     {
     w[t++]=s[i];
     w[t]='\0';
     }
     }
      //printf("\n%d",min);
     printf("\n\nSmallest word(s) :\n");
     for(i=0;s[i];i++)
     {
     if(s[i]==' ')
     {
      if(strlen(w)==min)
      printf("%s\n",w);
      for(j=0;w[j];j++)
      w[j]=' ';
      t=0;
     }
     else
     {
     w[t++]=s[i];
     w[t]='\0';
     }
     }
}
