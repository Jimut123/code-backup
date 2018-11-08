#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{
      char s[100],w[100];
      printf("\nEnter the name :\n");
      gets(s);
      int i,j,t=0,n;
      n=strlen(s);
      s[n++]=' ';
      printf("\nAfter reversing each word :\n");
      for(i=0;s[i];i++)
      {
       if(s[i]==' ')
       {
        for(j=t;j>=0;j--)
        printf("%c", w[j]);
        printf(" ");
        for(j=0;w[j];j++)
         w[j]=' ';
        t=0;
       }
       else
       w[t++]=s[i];
     }
     getch();
}
