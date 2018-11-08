#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<ctype.h>
main()
{
      char s[100];
      printf("\nEnter the string :\n");
      gets(s);
      int stack[100];
      int top=-1,i,n;
      int w;
      for(i=0;s[i];i++)
      {
                       if(s[i]!='+' && s[i]!='-' && s[i]!='*' && s[i]!='/' && s[i]!='^')
                       {
                                    /*if(s[i]=='0')
                                    w=0;
                                    else
                                    if(s[i]=='1')
                                    w=1;
                                    else
                                    if(s[i]=='2')
                                    w=2;
                                    else
                                    if(s[i]=='3')
                                    w=3;
                                    else
                                    if(s[i]=='4')
                                    w=4;
                                    else
                                    if(s[i]=='5')
                                    w=5;
                                    else
                                    if(s[i]=='6')
                                    w=6;
                                    else
                                    if(s[i]=='7')
                                    w=7;
                                    else
                                    if(s[i]=='8')
                                    w=8;
                                    else
                                    if(s[i]=='9')
                                    w=9;*/
                                    if(top==100)
                                    printf("\nOverflow!!!!!!!!!\n");
                                    else if(is
                                    stack[++top]=w;
                                    for(i=top;i>=0;i--)
      printf("%d\n",stack[i]);
                       }
                       else
                       {
                           if(w=='+')
                           stack[top-1]=stack[top]+stack[top-1];
                           else
                           if(w=='-')
                           stack[top-1]=stack[top-1]-stack[top];
                           else
                           if(w=='*')
                           stack[top-1]=stack[top]*stack[top-1];
                           else
                           if(w=='/')
                           stack[top-1]=stack[top]/stack[top-1];
                           else
                           if(w=='^')
                           stack[top-1]=(int)pow(stack[top],stack[top-1]);
                           top=top-1;
                       }
      }
      printf("\nValue of the expression : \n");
      //for(i=top;stack[i];i--)
      printf("%d\n",stack[top]);
      getch();
}
