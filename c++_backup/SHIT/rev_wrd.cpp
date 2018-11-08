#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{
      char s[100],w[100];
      printf("\nEnter the name :\n");
      gets(s);
      int i,j,t=0,n;
      n=strlen(s)-1;
      printf("\nAfter reversing each word :\n");
      for(i=n;i>=0;i--)
      {
       if(s[i]==' ')
       {
        for(j=strlen(w)-1;j>=0;j--)
        printf("%c", w[j]);
        printf(" ");
        t=0;
       }
       else
       {
       w[t++]=s[i];
       w[t]='\0';
       }
     }
     for(j=strlen(w)-1;j>=0;j--)
     printf("%c", w[j]);
     getch();
}
