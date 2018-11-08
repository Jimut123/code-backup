#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<math.h>
main()
{
      char s[100],c[100];
      printf("\nEnter the expression :\n");
      gets(s);
      double sum;
      int a[100],t=0,j=0,i,n=0,n1,n2,l=strlen(s);
      s[l++]=' ';
      printf("\nValue of the expression :\n");
      for(i=0;i<l;i++)
      {
       if(s[i]=='+' || s[i]=='-' || s[i]=='*' || s[i]=='/' || s[i]=='^' || s[i]==' ')
       {
        a[t++]=n;
        c[j++]=s[i];
        n=0;
       }
       else
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
       }   
      }
      for(i=0;i<t;i++)
      printf("%d, ",a[i]);
      printf("\n%s",c);
      for(i=0;i<t;i++)
      {
       if(c[i]=='^')
       {
        a[i]=pow(a[i],a[i+1]);
        j=i+1;
        while(j<t)
        {
         a[j]=a[j+1];
         j++;
        }
        
       }
       
      
      getch();
}

