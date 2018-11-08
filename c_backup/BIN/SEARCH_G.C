#include<stdio.h>
void main()
{
int i;
char ch,c[100];
char q[100][100]={{"Christmas"},
	    {"Amlyan"},
	    {"Jimut"},
	    {"Simut"},
	    {"Sachin"},
	    {"Rounak"},
	    {"google"},
	    {"facebook"},
	    {"twitter"},
	    {"instagram"},
	    {"whatsapp"},
	    {"zebra"},
	    {"cab"},
	    };
clrscr();
printf("Enter a string:");
for(i=0;scanf("%c",&c[i])!='*';i++)
;
puts(c);
getch();
}