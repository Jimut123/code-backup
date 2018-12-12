#include<stdio.h>
#include<conio.h>
main()
{
      char s[100],w[100];
      printf("\nEnter the name :\n");
      gets(s);
      int i,t=0;
      printf("\nAbbreviated name :\n");
      for(i=0;s[i];i++)
      {
       if(s[i]==' ')
       {
        printf("%c. ", w[0]);
        t=0;
       }
       else
       w[t++]=s[i];
     }
      printf("%s",w);
      getch();
}
