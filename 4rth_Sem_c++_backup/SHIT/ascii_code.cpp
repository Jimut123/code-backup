#include<stdio.h>
#include<conio.h>
main()
{
      char s[100];
      int a[100];
      int i,t;
      printf("\nEnter the string :\n");
      gets(s);
      t=0;
      for(i=0;s[i];i++)
      a[t++]=(int)s[i];
      printf("\nASCII coded string :\n");
      for(i=0;i<t;i++)
      printf("%d",a[i]);
      
      printf("\n\nEnter the ASCII coded string :\n");
      gets(s);
      char c[100];
      int n=0;t=0;
      for(i=0;s[i];i++)
      {
       if(s[i]=='1')
       n=(n*10)+1;
       else if(s[i]=='2')
       n=(n*10)+2;
       else if(s[i]=='3')
       n=(n*10)+3;
       else if(s[i]=='4')
       n=(n*10)+4;
       else if(s[i]=='5')
       n=(n*10)+5;
       else if(s[i]=='6')
       n=(n*10)+6;
       else if(s[i]=='7')
       n=(n*10)+7;
       else if(s[i]=='8')
       n=(n*10)+8;
       else if(s[i]=='9')
       n=(n*10)+9;
       else
       n=(n*10)+0;
       if(n>=65 && n<=90)
       {
       c[t++]=(char)n;
       n=0;
       }
       else if(n>=97 && n<=122)
       {
       c[t++]=(char)n;
       n=0;
       }
       else if(n>=48 && n<=67)
       {
       c[t++]=(char)n;
       n=0;
       }
       else if(n==32)
       {
       c[t++]=(char)n;
       n=0;
       }
      }
      c[t]='\0';
      printf("\nDecoded string :\n");
      printf("%s",c);
      getch();
}
