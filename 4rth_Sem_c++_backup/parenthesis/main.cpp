#include <iostream>
#include <bits/stdc++.h>
using namespace std;

ifstream f("data.in");
ofstream g("data.out");

char stack1[100];
int top;

void push(char x)
{
    top++;
    stack1[top]=x;
}
char pop()
{
    char k = stack1[top];
    top--;
    return k;
}
int main()
{
    char a,k;
    int m=0,top=0;
    a='o';
    while(a!='')
    {
        f>>a;
        top=0;
        if(a=='['||a=='{'||a=='(')
            push(a);
        if(a==']')
        {
            k=pop();
            if(k!='[')  m=1;
        }
        if(a=='}')
        {
            k=pop();
            if(k!='{')  m=1;
        }
        if(a==')')
        {
            k=pop();
            if(k!='(')  m=1;
        }
        if(m==0)
            g<<"OKAY!"<<endl;
        else
            g<<"NOT OKAY!"<<endl;
        }
    return 0;
}
