#include <iostream>
#include <bits/stdc++.h>
char stack_[] = {};
int top;
void push(char ch)
{
    top++;
    stack_[top]=ch;
}
char pop()
{
    char ch= stack_[top];
    top--;
    return ch;
}
void show_stack()
{
    for(int i=0;stack_[i]!='\0';i++)
        std::cout<<stack_[i]<<" ";
}
int main()
{
    top=0;
    int valid=1;
    char par[10] = "{{{{]",ch;          //{'{','{','{','{','}','}','}','}','[',']'},ch;
    for (int i=0;par[i]!='\0';i++)
    {
        //std::cout<<"LOL";
        ch=par[i];
        if(ch=='('||ch=='{'||ch=='[')
            push(ch);
        if(ch==')')
        {
            if(pop()!='(')
                valid=0;
        }
        else if(ch=='}')
        {
            if(pop()!='{')
                valid=0;
        }
        else if(ch==']')
        {
            if(pop()!='[')
                valid=0;
        }
        show_stack();
    }
    if (valid)
        std::cout<<"VALID"<<std::endl;
    else
        std::cout<<"INVALID"<<std::endl;
    return 0;
}
