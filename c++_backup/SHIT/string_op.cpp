#include<stdio.h>
#include<conio.h>
#include<string.h>
main()
{
      char s[100],s1[100],s2[100],w[100];
      int i,j,k,t=0,l1,l2;
      printf("\nEnter first string :\n");
      gets(s1);
      l1=strlen(s1);
      s1[l1++]=' ';
      s1[l1]='\0';
      printf("\nEnter second string :\n");
      gets(s2);
      l2=strlen(s2);
      s2[l2++]=' ';
      s2[l2]='\0';
      printf("\n\nFirst string in dictionary order :\n");
      for(j=65;j<=90;j++)
      for(i=0;i<l1;i++)
      if(s1[i]==' ')
      {
       if((int)w[0]==j || (int)w[0]==(j+32))
       printf("%s ",w);
       for(k=0;w[k];k++)
        w[k]=' ';
       t=0;
       }
       else
       {
       w[t++]=s1[i];
       w[t]='\0';
       }
      printf("\n\nSecond string in dictionary order :\n");
      for(j=65;j<=90;j++)
      for(i=0;i<l2;i++)
      if(s2[i]==' ')
      {
       if((int)w[0]==j || (int)w[0]==(j+32))
       printf("%s ",w);
       for(k=0;w[k];k++)
        w[k]=' ';
       t=0;
       }
       else
       {
       w[t++]=s2[i];
       w[t]='\0';
       }
       
       getch();
}
