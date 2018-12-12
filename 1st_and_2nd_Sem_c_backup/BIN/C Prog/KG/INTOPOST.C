#include <stdio.h>
#include <conio.h>
void push(char);
char pop();
int precedence(char);

char stack[100];
int top=-1;

void push(char data){
	if(top==99){
		printf("Stack Overflow");
		return;
	}
	top++;
	stack[top]=data;
}

char pop(){
	return stack[top--];
}

main(){
	char In[80], P[80];

	clrscr();
	printf("\nEnter the infix expr.:");
	gets(In);
	Intopost(In, P);
	printf("\nThe postfix expr. is:");
	puts(P);
	getch();
}

Intopost(char In[], char P[]){
	int i, j;
	char y;

	i=j=0;

	while(In[i]!='\0'){
		if((In[i]>=65 &&In[i]<=90) || (In[i]>=97 && In[i]<=122))
			P[j++]=In[i];
		else if(In[i]=='(')
			push(In[i]);
		else if(In[i]==')')
			while((y=pop())!='(')
				P[j++]=y;
		else if(In[i]=='+' || In[i]=='-' || In[i]=='*' || In[i]=='/')
                	{
			while(top!=-1){
				y=pop();
				if(y=='('){
					push(y);
					break;
				}

				else if(precedence(y)<precedence(In[i])){
					push(y);
					break;
				}
				else P[j++]=y;
			}
			push(In[i]);
		}

		if(In[i]!='\0')
			i++;
	}

	while(top!=-1)
		P[j++]=pop();
	P[j]='\0';
}

precedence(char op){
	if(op=='+' || op=='-')
		return 2;
	else if(op=='*' || op=='/')
		return 3;
}

