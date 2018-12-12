#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <conio.h>
#define SIZE 100
int stack[SIZE], top=-1;

main(){
	char P[80];
	int result;
	clrscr();
	printf("\nEnter the postfix expression:");
	gets(P);
	result=postfix(P);
	printf("\nThe result is: %d", result);
	getch();
}

postfix(char P[]){
	int i, j, op1, op2;
	char temp[10];
	i=0;
	while(P[i]!='\0'){
		j=0;
		while(P[i]>='0' && P[i]<='9')
			temp[j++]=P[i++];
		temp[j]='\0';
		if(j!=0)/*operand found*/
			push(atoi(temp));
		if(P[i]=='+' || P[i]=='-' || P[i]=='*' || P[i]=='/'){
			op1=pop();
			op2=pop();
			if(op1==-9999 || op2==-9999){
				printf("\nInsufficient operands");
				getch();
				exit(0);
			}
			switch(P[i]){
				case '+': push(op2+op1);
					  break;
				case '-': push(op2-op1);
					  break;
				case '*': push(op2*op1);
					  break;
				case '/': push(op2/op1);
			}/*end of switch*/
		}/*end of operator if*/
		if(P[i]!='\0')
			i++;
	}/*end of outer while*/
	if(top!=0){
		printf("\nError");
		getch();
		exit(0);
	}
	return pop();/*return result*/
}/*end of function*/


push(int data){
	if(top>=SIZE-1){
		printf("Stack Overflow");
		return;
	}
	top++;
	stack[top]=data;
}

pop(){
	int d;
	if(top==-1){
		printf("Stack Underflow");
		return -9999;
	}
	/*d=stack[top];
	top--;
	return d;*/
	return stack[top--];
}