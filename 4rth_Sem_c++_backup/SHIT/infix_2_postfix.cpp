#include<stdio.h>
#include<conio.h>
#include<math.h>
void push(char);
char pop();
int priority(char);
char stk[100];
int top=-1;
main()
{
      char s[100];
      printf("\nEnter the infix expression :\n");
      gets(s);
      char pst[100];
      int i,j,f=0,t=0;
      for(i=0;s[i];i++)
      {

                       if(s[i]!='+' && s[i]!='-' && s[i]!='*' && s[i]!='/' && s[i]!='^' && s[i]!='(' && s[i]!=')')
                       pst[t++]=s[i];
                       else
                       {
                           if(s[i]==')')
                           {
                                        while(stk[top]!='(')
                                        pst[t++]=pop();
                                        top--;
                           }
                           else
                           {
                               if(top>-1 && stk[top]!='(')
                               {
                                         for(j=top;j>=0;j--)
                                         {
                                                            if(priority(stk[j])<priority(s[i]))
                                                            {
                                                                    push(s[i]);
                                                                    f=1;
                                                                    break;
                                                            }
                                                            else
                                                            pst[t++]=pop();
                                         }
                                         top=j;
                                         if(f==0)
                                         push(s[i]);
                               }
                               else
                               push(s[i]);
                           }
                       }
     //for(i=0;pst[i];i++)
      //printf("%c ",pst[i]);
      }
       for(i=0;pst[i];i++)
      printf("%c ",pst[i]);
      if(top>-1)
      {
                while(top>-1)
                pst[t++]=pop();
      }
      printf("\n\nEquivalent postfix expression : \n");
      for(i=0;pst[i];i++)
      printf("%c ",pst[i]);
      printf("\n\nOperator stack : \n");
      for(i=top;i>=0;i--)
      printf("%c\n",stk[i]);
      getch();
}
void push(char ch)
{
     stk[++top]=ch;
}
char pop()
{
     int f=top;
     top--;
     return stk[f];
}
int priority(char ch)
{
    if(ch=='+' || ch=='-')
    return 0;
    else
    if(ch=='*' || ch=='/')
    return 1;
    else
    if(ch=='^')
    return 2;
}
