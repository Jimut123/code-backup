#include<stdio.h>
void main()
{
	char s[20],s1[20],s2[40];
	int l;
	printf("Enter a string ::");
	gets(s);
	l=xtrln(s);
	printf("%d \n",l);
	printf("Enter another string ::");
	gets(s1);
	strct(s,s1,s2);
	for(l=0;l!='\0';l++)
	printf(" %c",s2[l]);
}
int xtrln(char *s)
{
	int l=0;
	while(*s!='\0')
	{
		s++;
		l++;
	}
	return l;
}
char strct(char *s,char *s1,char *s2)
{
	while(*s!='\0')
	*s2=*s;
	while(*s1!='\0')
	*s2=*s1;
	*s2='\0';
	return 0;
}
