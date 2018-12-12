#include<stdio.h>
#include<conio.h>
main()
{
      char s[100],w[100],n[100],c;
      int i,j,t,p;
      printf("\nEnter the string :\n");
      gets(s);
      t=0;
      for(i=0;s[i];i++)
      {
       c=s[i];
       if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
       {
        p=i;
        break;
       }
       else
       w[t++]=c;
      }
      w[t++]='A';
      w[t++]='Y';
      w[t]='\0';
      j=0;
      for(i=p;s[i];i++)
      n[j++]=s[i];
      for(i=0;i<t;i++)
      n[j++]=w[i];
      n[j]='\0';
      printf("\nPIGLATIN : %s",n);
      getch();
}
